package com.demoqa.tests;

import Config.ConfigTests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.utils.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    static ConfigTests config = ConfigFactory.create(ConfigTests.class);
    @BeforeAll
    static void configurationTests() {
        String urlSelenoid = new StringBuilder(System.getProperty("url_selenoid"))
                .insert(8, config.login() + ":" + config.password() + "@")
                .toString();

        SelenideLogger.addListener("allure", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.holdBrowserOpen = false; //true = не закрывать браузер после тестов
        Configuration.browserSize = System.getProperty("browser_size");
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
        Configuration.remote = urlSelenoid;
    }
    @AfterEach
    void addAttachment() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
