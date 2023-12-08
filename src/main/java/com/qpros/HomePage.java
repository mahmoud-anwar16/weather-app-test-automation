package com.qpros;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

public class HomePage extends BasePage{

    private By sideMenu = By.xpath ( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton");

    private By unitSetting = By.id ("com.weather.forecast.weatherchannel:id/ll_unit_settings");

    private By setTemperature =By.id("com.weather.forecast.weatherchannel:id/tg_temperature");

    private By setTime = By.id ("com.weather.forecast.weatherchannel:id/tg_time_format");

    private By done =By.id ("com.weather.forecast.weatherchannel:id/btn_done");


    private By getTemperature = By.xpath (  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");



    private  By getTime = By.id ( "com.weather.forecast.weatherchannel:id/tvHour");

    private By hourlycheck = By.xpath ( "//*[@resource-id =\"com.weather.forecast.weatherchannel:id/ll_hour\"]");

    public HomePage(AppiumDriver driver) {
        super(driver);
    }


    public void openSideMenu(){
        waitForVisibility(sideMenu);
        clickElement(sideMenu);
    }
    public void selectUnit(){
        clickElement(unitSetting);

    }
    public void changeTemp(){
        waitForVisibility(setTemperature);
        clickElement(setTemperature);

    }
    public void changeTime(){
        clickElement(setTime);
    }
    public void clickOnDone(){

        clickElement(done);
    }

    public String getTemp() {

        String temp = getElementText(getTemperature);
        return temp;
    }

    public int celsiusToFahrenheit(int celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return (int) Math.ceil(fahrenheit);

    }
    public String getTime(){
        waitForVisibility(getTime);
        String time = getElementText(getTime);
        return  time;

    }
    public String convertTo12HourFormat(String time24Hour) throws ParseException {
        SimpleDateFormat sdf24Hour = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sdf12Hour = new SimpleDateFormat("hh:mm a");
        Date date = sdf24Hour.parse(time24Hour);
        return sdf12Hour.format(date);
    }
    public void rainingChance() {
        int count = 0;
        List<MobileElement> rain = driver.findElements(By.xpath("//*[@resource-id=\"com.weather.forecast.weatherchannel:id/tv_hourly_rain_probability\"]"));
        for (MobileElement element : rain) {
            if (count < 6) {
                String values = element.getText();
            }
            count++;
        }

    }



}