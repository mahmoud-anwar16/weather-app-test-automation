package com.weather;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class EntrySettings extends BasePage {
    public EntrySettings(AppiumDriver driver) {
        super(driver);
    }

    @AndroidBy(id = "com.weather.forecast.weatherchannel:id/tg_format_time_setting")
    MobileElement changeTime;
    @AndroidBy(id = "com.weather.forecast.weatherchannel:id/tvDone")
    MobileElement doneBtn;

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]")
    MobileElement close;
    @AndroidBy(xpath = "com.weather.forecast.weatherchannel:id/md_buttonDefaultNegative")
    MobileElement dontAllowLocation;



    public void changeTime(){click(changeTime);
 }
 public void clickDone(){
     click(doneBtn);
 }
 public void SkipAds(){
     click(close);

 }
 public void disableLocation(){
     click(dontAllowLocation);
 }






}