package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.utils.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void configurationTests() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.holdBrowserOpen = false; //true = не закрывать браузер после тестов
        Configuration.browserSize = "1700x920";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
    @AfterEach
    void addAttachement() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
