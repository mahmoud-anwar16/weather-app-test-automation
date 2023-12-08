package com.qpros;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.text.ParseException;

public class WeatherTest extends TestBase {

    private EntrySettings settings;
    private HomePage page;

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void weatherTest() throws ParseException {
        settings = new EntrySettings(driver);
        page = new HomePage(driver);

        settings.changeTimeHomePage();
        settings.clickDone();
        settings.disableLocation();
        String initTime = page.getTime();

        String initTemp = page.getTemp();

        page.openSideMenu();
        page.selectUnit();
        page.changeTemp();
        page.changeTime();
        page.clickOnDone();

        String convertTo12Hour = page.convertTo12HourFormat(initTime);
        softAssert.assertNotEquals(initTime, convertTo12Hour);

        String convertedTemp = String.valueOf(page.celsiusToFahrenheit(Integer.parseInt(initTemp)));
        softAssert.assertEquals(page.getTemp(), convertedTemp);
        softAssert.assertAll();

        page.rainingChance();
    }
}
