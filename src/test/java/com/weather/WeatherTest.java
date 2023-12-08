package com.weather;

import org.testng.annotations.Test;

public class WeatherTest extends TestBase {

    public WeatherTest() {

    }
    EntrySettings settings  =new EntrySettings(driver);
    HomePage page =new HomePage(driver);


@Test
public void weather(){


    settings.changeTime();
    settings.clickDone();
    settings.SkipAds();
    settings.disableLocation();
    page.openSideMenu();
    page.selectUnit();
    page.changeTemp();
    page.changeTime();
    page.clickOnDone();
    page.getTemp();
    page.getTime();
    page.AssetTimeOfHours();
    page.AssetChanceToRain();
    page.AssertChanceToHumidity();


}

}
