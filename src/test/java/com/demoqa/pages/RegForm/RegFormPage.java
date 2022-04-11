package com.demoqa.pages.RegForm;

import com.demoqa.pages.RegForm.Components.RegFormCalendar;
import com.demoqa.pages.RegForm.Components.SelectStateAndCity;

import java.time.LocalDate;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class RegFormPage{
    static String PATH = "/automation-practice-form";
    RegFormLocators locator = new RegFormLocators();
    RegFormCalendar calendar = new RegFormCalendar();
    SelectStateAndCity stateAndCity = new SelectStateAndCity();

    public RegFormPage openPage() {
        open(PATH);
        executeJavaScript("$('footer').remove(); $('#fixedban').remove()");
        return this;
    }
    public void submitClick() {
        locator.submitButton.click();
    }
    public RegFormPage setFirstName(String firstName) {
        locator.firstNameInput.setValue(firstName);
        return this;
    }
    public RegFormPage setLastName(String lastName) {
        locator.lastNameInput.setValue(lastName);
        return this;
    }
    public RegFormPage setEmail(String email) {
        locator.userEmailInput.setValue(email);
        return this;
    }
    public RegFormPage setPhone(String mobileNumber) {
        locator.mobileNumber.setValue(mobileNumber);
        return this;
    }
    public RegFormPage setGender(String gender) {
        locator.gender.$(byText(gender)).click();
        return this;
    }
    public RegFormPage setSubject(String subject) {
        locator.subjectsInput.setValue(subject).pressEnter();
        return this;
    }
    public RegFormPage setHobbies(String hobby) {
        locator.hobby.$(byText(hobby)).click();
        return this;
    }
    public RegFormPage setAddress(String address) {
        locator.currentAddress.setValue(address);
        return this;
    }
    public RegFormPage setPicture(String pathToImage) {
        locator.uploadPicture.uploadFromClasspath(pathToImage);
        return this;
    }
    public RegFormPage setBirthDay(LocalDate date) {
        locator.dataOfBirt.click();
        calendar.setDate(date);
        return this;
    }
    public RegFormPage setStateAndCity(String state, String city){
        locator.state.click();
        stateAndCity.setState(state);

        locator.city.click();
        stateAndCity.setCity(city);
        return this;
    }
}
