package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestPracticeForm extends PagePracticeForm{
    @BeforeAll
    static void configurationTests() {
        Configuration.holdBrowserOpen = false; //true = не закрывать браузер после тестов
        Configuration.browserSize = "1440x900";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
    }

    @BeforeEach
    void setUp() {
        open("/automation-practice-form");
        hideFooterAndAds();
    }

    @Test
    @DisplayName("Позитивный тест")
    void positiveTest() {
        //personalData
        firstName.setValue(name);
        lastName.setValue(surname);
        userEmail.setValue(email);
        genderLabelMale.click();
        mobileNumber.setValue(phone);

        //Subjects
        subjectsInput.setValue(subjectCommerce).pressEnter();

        //data birthday
        dataOfBirt.click();
        selectMonth.selectOption(month);
        selectYear.selectOption(year);
        selectDay.click();

        //hobbies
        hobbiesCheckbox1.click();

        //picture
        uploadPucture.uploadFromClasspath(pathToImg);

        //set address
        currentAddress.setValue(address);

        //state and city
        stateParent.scrollIntoView(true).click();
        selectState.click();
        cityParent.scrollIntoView(true).click();
        selectCity.click();

        //click submit
        submitButton.click();

        //проверка таблицы результата
        $(".modal-body").shouldHave(
                text(fullName),
                text(email),
                text(genderMale),
                text(phone),
                text(dateBirth),
                text(subjectCommerce),
                text(hobbieSports),
                text(pathToImg),
                text(address),
                text(stateAndCity)
        );
    }
}
