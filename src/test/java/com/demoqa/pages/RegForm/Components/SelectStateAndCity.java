package com.demoqa.pages.RegForm.Components;

import com.demoqa.pages.RegForm.RegFormLocators;

import static com.codeborne.selenide.Selectors.byText;

public class SelectStateAndCity {
    RegFormLocators locator = new RegFormLocators();

    public void setState(String state) {
        locator.state.$(byText(state)).scrollTo().click();
    }
    public void setCity(String city) {
        locator.city.$(byText(city)).scrollTo().click();
    }
}
