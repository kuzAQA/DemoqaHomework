package com.demoqa.testData;

import com.demoqa.testData.enums.Gender;
import com.demoqa.testData.enums.Hobbies;
import com.demoqa.testData.enums.StatesAndCities.HaryanaCities;
import com.demoqa.testData.enums.StatesAndCities.NCRCities;
import com.demoqa.testData.enums.StatesAndCities.RajasthanCities;
import com.demoqa.testData.enums.StatesAndCities.State;
import com.demoqa.testData.enums.Subjects;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public class Generator {
    private static final Faker fakerData = new Faker(new Locale("ru"));

    public static String randomFirstName() {
        return fakerData.name().firstName();
    }

    public static String randomLastName() {
        return fakerData.name().lastName();
    }

    public static String randomEmail() {
        Faker fakeEmail = new Faker();
        return fakeEmail.internet().emailAddress();
    }

    public static String randomGender() {
        return Gender.values()[ (int)(Math.random() * Gender.values().length) ].toString();
    }

    public static String randomPhoneNumber() {
        return fakerData.numerify("##########").replaceFirst("[0-8]", "9");
    }

    public static String randomSubject() {
        return Subjects.values()[ (int)(Math.random() * Subjects.values().length) ].toString();
    }

    public static String randomHobbies() {
        return Hobbies.values()[ (int)(Math.random() * Hobbies.values().length) ].toString();
    }

    public static String randomAddress() {
        StringBuilder address = new StringBuilder(fakerData.address().fullAddress());
        return address.replace(0, 6, fakerData.numerify("######"))
                .toString()
                .replaceFirst("[0-9]", "6");
    }

    public static LocalDate getDate() {
        return new java.sql.Date(fakerData.date().birthday().getTime()).toLocalDate();
    }

    public static String randomState() {
        return State.values()[ (int)(Math.random() * State.values().length) ].toString();
    }

    public static String randomCity(String state) {
        return switch (state) {
            case "NCR" -> NCRCities.values()[(int) (Math.random() * NCRCities.values().length)].toString();
            case "Haryana" -> HaryanaCities.values()[(int) (Math.random() * HaryanaCities.values().length)].toString();
            case "Rajasthan" -> RajasthanCities.values()[(int) (Math.random() * RajasthanCities.values().length)].toString();
            default -> "";
        };
    }

}
