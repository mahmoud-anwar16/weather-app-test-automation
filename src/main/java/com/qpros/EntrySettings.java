package com.qpros;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class EntrySettings extends BasePage {

    private final By changeTimeHomepage = By.id("com.weather.forecast.weatherchannel:id/tg_format_time_setting");

    private final By doneBtn = By.id("com.weather.forecast.weatherchannel:id/tvDone");


    private final By close = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]");

    private final By dontAllowLocation = By.id("com.weather.forecast.weatherchannel:id/md_buttonDefaultNegative");

    public EntrySettings(AppiumDriver driver) {
        super(driver);
    }


    public void changeTimeHomePage() {
        waitForVisibility(changeTimeHomepage);
        clickElement(changeTimeHomepage);
    }

    public void clickDone() {
        clickElement(doneBtn);
    }

    public void disableLocation() {
        waitForVisibility(dontAllowLocation);
        clickElement(dontAllowLocation);
    }
}
