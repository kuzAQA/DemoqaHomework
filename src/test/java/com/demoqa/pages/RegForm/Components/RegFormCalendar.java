package com.demoqa.pages.RegForm.Components;


import com.demoqa.pages.RegForm.RegFormLocators;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

import static com.codeborne.selenide.Selectors.byText;

public class RegFormCalendar {
    RegFormLocators locator = new RegFormLocators();
    public void setDate(LocalDate date) {
        locator.month.selectOption(StringUtils.capitalize(date.getMonth().toString().toLowerCase()));
        locator.year.selectOption(Integer.toString(date.getYear()));
        locator.day.$(byText(Integer.toString(date.getDayOfMonth()))).click();
    }
}
