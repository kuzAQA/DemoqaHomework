package com.demoqa.tests;

import com.demoqa.pages.RegForm.Components.RegFormCalendar;
import com.demoqa.pages.RegForm.RegFormPage;
import com.demoqa.pages.RegForm.RegFormTestData;
import com.demoqa.testData.Generator;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegFormTests extends TestBase{
    RegFormPage form = new RegFormPage();
    RegFormTestData data = new RegFormTestData();

    @Test
    @DisplayName("Позитивный тест")
    void positiveTest() {

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
                .submitClick();


        //проверка таблицы результата
//        $(".modal-body").shouldHave(
//                text(fullName),
//                text(email),
//                text(genderMale),
//                text(phone),
//                text(dateBirth),
//                text(subjectCommerce),
//                text(hobbieSports),
//                text(pathToImg),
//                text(address),
//                text(stateAndCity)
//        );
    }
}
