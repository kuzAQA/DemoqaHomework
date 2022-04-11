package com.demoqa.pages.RegForm;

import com.demoqa.testData.Generator;

import java.time.LocalDate;
import java.util.Locale;

public class RegFormTestData {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address;
    private final String gender;
    private final String subject;
    private final String hobby;
    private final String pathToPicture;
    private final LocalDate birthDay;
    private final String state;
    private final String city;

    public RegFormTestData() {
        firstName = Generator.randomFirstName();
        lastName = Generator.randomLastName();
        email = Generator.randomEmail();
        gender = Generator.randomGender();
        phone = Generator.randomPhoneNumber();
        subject = Generator.randomSubject();
        hobby = Generator.randomHobbies();
        pathToPicture = "Riki.jpg";
        address = Generator.randomAddress();
        birthDay = Generator.getDate();
        state = Generator.randomState();
        city = Generator.randomCity(state);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobby() {
        return hobby;
    }

    public String getPathToPicture() {
        return pathToPicture;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}

