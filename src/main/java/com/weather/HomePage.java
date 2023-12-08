package com.weather;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import org.testng.asserts.SoftAssert;

public class HomePage extends BasePage{
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")
    MobileElement sideMenu;
    @AndroidBy(id = "com.weather.forecast.weatherchannel:id/ll_unit_settings")
    MobileElement unitSetting;
    @AndroidBy(id = "com.weather.forecast.weatherchannel:id/tg_temperature")
    MobileElement setTemperature;
    @AndroidBy(id ="com.weather.forecast.weatherchannel:id/tg_time_format")
    MobileElement setTime;
    @AndroidBy(id="com.weather.forecast.weatherchannel:id/btn_done")
    MobileElement done;

    @AndroidBy(id= "com.weather.forecast.weatherchannel:id/tg_temperature_unit_home")
    MobileElement getTemperature;


    @AndroidBy(id = "com.weather.forecast.weatherchannel:id/tvHour")
    MobileElement getTime;

    //    @AndroidBy(id = "com.weather.forecast.weatherchannel:id/llMoreHour")
    //    MobileElement moreBtn;
    //    @AndroidBy(id="com.weather.forecast.weatherchannel:id/rl_option_home")
    //    MobileElement fist

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    MobileElement swipe;

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
    MobileElement time;
    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    MobileElement hourlycheck;

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView")
    MobileElement chanceToRain;
@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView")
        MobileElement humidity;


SoftAssert softAssert =new SoftAssert();




    public void openSideMenu(){
    click(sideMenu);
}
public void selectUnit(){
    click(unitSetting);

}
public void changeTemp(){
    click(setTemperature);

}
public void changeTime(){
    click(setTime);
}
public void clickOnDone(){

    click(done);
}
public void getTemp(){
getText(getTemperature);

}
public void getTime(){
    getText(getTime);

}


public void AssetTimeOfHours(){
    for (int i =0 ; i<5 ; i++){
        scrollFromLeftToRight(swipe);

        softAssert.assertEquals(true, getText(time));

    }

}
public void AssetChanceToRain(){
    for (int i =0 ; i<6 ; i++){

        softAssert.assertEquals(true, getText(chanceToRain));

    }
}
public void AssertChanceToHumidity(){
    for (int i =0 ; i<6 ; i++){

        softAssert.assertEquals(true, getText(humidity));

    }
    softAssert.assertAll();
}



}