package com.demoqa;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PagePracticeForm {
    protected String name = "Igor";
    protected String surname = "Kuznetsov";
    protected String email = "test@test.ru";
    protected String phone = "9998881122";
    protected String subjectCommerce = "Commerce";
    protected String month = "July";
    protected String year = "1997";
    protected String day = "23";
    protected String genderMale = "Male";
    protected String genderFemale = "Female";
    protected String genderOther = "Other";
    protected String hobbieSports = "Sports";
    protected String hobbieReading = "Reading";
    protected String hobbieMusic = "Music";
    protected String pathToImg = "Riki.jpg";
    protected String address = "Улица Пушкина, дом Колотушкина";
    protected String state = "Haryana";
    protected String city = "Karnal";

    String fullName = name + " " + surname;
    String dateBirth = day + " " + month + "," + year;
    String stateAndCity = state + " " + city;

    SelenideElement submitButton = $("#submit");
    SelenideElement uploadPucture = $("#uploadPicture");

    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $("#lastName");
    SelenideElement userEmail = $("#userEmail");

    SelenideElement genderLabelMale = $("#genterWrapper").$(byText(genderMale));
    SelenideElement genderLabelFemale = $("#genterWrapper").$(byText(genderFemale));
    SelenideElement genderLabelOther = $("#genterWrapper").$(byText(genderOther));

    SelenideElement mobileNumber = $("#userNumber");
    SelenideElement dataOfBirt = $("#dateOfBirthInput");
    SelenideElement subjectsInput = $("#subjectsInput");
    //calendar
    SelenideElement selectMonth = $(".react-datepicker__month-select");
    SelenideElement selectYear = $(".react-datepicker__year-select");
    SelenideElement selectDay = $(".react-datepicker__month").$(byText(day));

    SelenideElement hobbiesCheckbox1 = $("#hobbiesWrapper").$(byText(hobbieSports));
    SelenideElement hobbiesCheckbox2 = $("#hobbiesWrapper").$(byText(hobbieReading));
    SelenideElement hobbiesCheckbox3 = $("#hobbiesWrapper").$(byText(hobbieMusic));

    SelenideElement currentAddress = $("#currentAddress");

    SelenideElement stateParent = $("#state");
    SelenideElement selectState = $(byText(state));

    SelenideElement cityParent = $("#city");
    SelenideElement selectCity = $(byText(city));

    public void hideFooterAndAds() { //для отключения рекламного блока и футера на маленьком экране, чтобы кнопка Submit была видна
        executeJavaScript("$('footer').remove(); $('#fixedban').remove()");
    }
}
