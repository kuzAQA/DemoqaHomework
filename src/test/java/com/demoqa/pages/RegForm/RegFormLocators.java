package com.demoqa.pages.RegForm;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegFormLocators {
    public SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            gender = $("#genterWrapper"),
            mobileNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobby = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),

            dataOfBirt = $("#dateOfBirthInput"),
            day = $(".react-datepicker__month"),
            mounth = $(".react-datepicker__month-select"),
            year = $(".react-datepicker__year-select"),

            state = $("#state"),
            city = $("#city"),
            submitButton = $("#submit");

}