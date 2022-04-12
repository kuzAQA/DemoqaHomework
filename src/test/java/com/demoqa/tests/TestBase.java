package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void configurationTests() {
        Configuration.holdBrowserOpen = false; //true = не закрывать браузер после тестов
        Configuration.browserSize = "1700x920";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
    }
}
