package com.demoqa.PracticeForm;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PagePracticeForm {
    protected String name = "Igor";
    protected String surname = "Kuznetsov";
    protected String email = "test@test.ru";
    protected String phone = "9998881122";
    protected String imagePath = "/src/test/resources/Riki.jpg";
    protected String subjectEnglish = "eng";
    protected String subjectCommerce = "com";
    protected String month = "July";
    protected String year = "1997";
    protected String day = "23";
    protected String pathToImg = "Riki.jpg";
    protected String address = "Улица Пушкина, дом Колотушкина";
    protected String state = "Haryana";
    protected String city = "Karnal";


    SelenideElement submitButton = $("#submit");
    SelenideElement uploadPucture = $("#uploadPicture");


    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $("#lastName");
    SelenideElement userEmail = $("#userEmail");

    SelenideElement genderMale = $("#genterWrapper").$(byText("Male"));
    SelenideElement genderFemale = $("#genterWrapper").$(byText("Female"));
    SelenideElement genderOther = $("#genterWrapper").$(byText("Other"));

    SelenideElement mobileNumber = $("#userNumber");
    SelenideElement dataOfBirt = $("#dateOfBirthInput");
    SelenideElement subjectsInput = $("#subjectsInput");
    //calendar
    SelenideElement selectMonth = $(".react-datepicker__month-select");
    SelenideElement selectYear = $(".react-datepicker__year-select");
    SelenideElement selectDay = $(".react-datepicker__month").$(byText(day));


    SelenideElement hobbiesCheckbox1 = $("#hobbiesWrapper").$(byText("Sports"));
    SelenideElement hobbiesCheckbox2 = $("#hobbiesWrapper").$(byText("Reading"));
    SelenideElement hobbiesCheckbox3 = $("#hobbiesWrapper").$(byText("Music"));

    SelenideElement currentAddress = $("#currentAddress");

    SelenideElement stateParent = $("#state");
    SelenideElement selectState = $(byText(state));

    SelenideElement cityParent = $("#city");
    SelenideElement selectCity = $(byText(city));

    public void hideFooterAndAds() {
        executeJavaScript("$('footer').remove(); $('#fixedban').remove()");
    }
}
