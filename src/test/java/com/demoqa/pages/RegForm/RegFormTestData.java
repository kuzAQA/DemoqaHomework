package com.demoqa.pages.RegForm;

import com.demoqa.testData.Generator;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

import static java.lang.String.format;

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
    private final String pictuteName;
    private final LocalDate birthDay;
    private final String month;
    private final String state;
    private final String city;

    //expected values
    private final String expectedFullName;
    private final String expectedStateAndCity;
    private final String expectedBirthDate;


    public RegFormTestData() {
        firstName = Generator.randomFirstName();
        lastName = Generator.randomLastName();
        email = Generator.randomEmail();
        gender = Generator.randomGender();
        phone = Generator.randomPhoneNumber();
        subject = Generator.randomSubject();
        hobby = Generator.randomHobbies();
        pathToPicture = "Riki.jpg";
        pictuteName = "Riki.jpg";
        address = Generator.randomAddress();
        birthDay = Generator.getDate();
        month = StringUtils.capitalize(birthDay.getMonth().toString().toLowerCase());

        state = Generator.randomState();
        city = Generator.randomCity(state);

        //expected values
        expectedFullName = format("%s %s", firstName, lastName);
        expectedStateAndCity = format("%s %s", state, city);
        expectedBirthDate = format("%s %s,%s", birthDay.getDayOfMonth(), month, birthDay.getYear());
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

    public String getPictuteName() {
        return pictuteName;
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

    //expected getter
    public String getExpectedFullName() {
        return expectedFullName;
    }

    public String getExpectedStateAndCity() {
        return expectedStateAndCity;
    }

    public String getExpectedBirthDate() {
        return expectedBirthDate;
    }
}

