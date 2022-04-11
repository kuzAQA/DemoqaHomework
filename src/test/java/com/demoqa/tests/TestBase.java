package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.testData.Generator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBase {
    @BeforeAll
    static void configurationTests() {
        Configuration.holdBrowserOpen = false; //true = не закрывать браузер после тестов
        Configuration.browserSize = "1700x920";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
    }

    @BeforeEach
    void setUp() {}
}
