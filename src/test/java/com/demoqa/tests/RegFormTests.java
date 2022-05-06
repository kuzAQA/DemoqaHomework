package com.demoqa.tests;

import com.demoqa.pages.RegForm.RegFormPage;
import com.demoqa.pages.RegForm.RegFormTestData;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

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
        step("Открываем страницу с формой", () -> {
            form.openPage();
        });
        step("Задаем им", () -> {
            form.setFirstName(data.getFirstName());
        });
        step("Задаем фамилию", () -> {
            form.setLastName(data.getLastName());
        });
        step("Задаем emaik", () -> {
            form.setEmail(data.getEmail());
        });
        step("Выбираем гендер", () -> {
            form.setGender(data.getGender());
        });
        step("Задаем телефон", () -> {
            form.setPhone(data.getPhone());
        });
        step("Задаем дату рождения", () -> {
            form.setBirthDay(data.getBirthDay());
        });
        step("Задаем темы", () -> {
            form.setSubject(data.getSubject());
        });
        step("Задаем хобби", () -> {
            form.setHobbies(data.getHobby());
        });
        step("Загружаем картинку", () -> {
            form.setPicture(data.getPathToPicture());
        });
        step("Задаем адрес", () -> {
            form.setAddress(data.getAddress());
        });
        step("Задаем штат и город", () -> {
            form.setStateAndCity(data.getState(), data.getCity());
        });
        step("Нажимаем на кнопку Submit", () -> form.clickSubmitButton());

        //assertions
        step("Проверка таблицы с результатом заполнения", () -> {
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
                    .checkResulnTables("State and City", data.getExpectedStateAndCity());
        });
        step("Закрываем таблицу с результатом заполнения", ()-> checks.clickCloseButton());
    }
}
