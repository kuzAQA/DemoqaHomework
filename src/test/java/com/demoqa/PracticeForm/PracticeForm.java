package com.demoqa.PracticeForm;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm extends PagePracticeForm{
    @BeforeAll
    static void configurationTests() {
        Configuration.holdBrowserOpen = true;
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
        genderMale.click();
        mobileNumber.setValue(phone);

        //Subjects
        subjectsInput.setValue(subjectEnglish).pressEnter();
        subjectsInput.setValue(subjectCommerce).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

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

        //реализовать првоерки значений из результата в таблице
    }

}
