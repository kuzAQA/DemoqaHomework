package com.demoqa.tests;

import com.demoqa.pages.RegForm.RegFormPage;
import com.demoqa.pages.RegForm.RegFormTestData;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Owner("Igor Kuznetsov")
@Feature("Тест заполнения формы Demoqa")
public class RegFormTests extends TestBase{
    RegFormPage form = new RegFormPage();
    RegFormTestData data = new RegFormTestData();
    RegFormPage checks = new RegFormPage();


    @Test
    @DisplayName("Заполнение формы")
    void positiveTest() {
        //set values in the table
        form
                .openPage()
                .setFirstName(data.getFirstName())
                .setLastName(data.getLastName())
                .setEmail(data.getEmail())
                .setGender(data.getGender())
                .setPhone(data.getPhone())
                .setBirthDay(data.getBirthDay())
                .setSubject(data.getSubject())
                .setHobbies(data.getHobby())
                .setPicture(data.getPathToPicture())
                .setAddress(data.getAddress())
                .setStateAndCity(data.getState(), data.getCity())
                .clickSubmitButton();

        //assertions
        checks
                .checkResulnTables("Student Name", data.getExpectedFullName())
                .checkResulnTables("Student Email", data.getEmail())
                .checkResulnTables("Gender", data.getGender())
                .checkResulnTables("Mobile", data.getPhone())
                .checkResulnTables("Date of Birth", data.getExpectedBirthDate())
                .checkResulnTables("Subjects", data.getSubject())
                .checkResulnTables("Hobbies", data.getHobby())
                .checkResulnTables("Picture", data.getPictuteName())
                .checkResulnTables("Address", data.getAddress())
                .checkResulnTables("State and City", data.getExpectedStateAndCity())
                .clickCloseButton();
    }
}
