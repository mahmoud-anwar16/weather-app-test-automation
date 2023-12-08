package com.weather;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
   // LoggerManager utils = new LoggerManager();
    public AppiumDriver driver;


    public BasePage(AppiumDriver driver) {

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForVisibility(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(driver, LoggerManager.WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(MobileElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element) {
        waitForVisibility(element);
        element.click();
    }

    protected  void sendKeys(MobileElement element, String text)
    {
        waitForVisibility(element);
        element.sendKeys(text);
    }
    public String getAttribute(MobileElement element , String attribute) {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }
    public String getText(MobileElement element){
        waitForVisibility(element);
        return element.getText();

    }
    public void scrollFromLeftToRight(MobileElement swipe){
        Dimension dimension = driver.manage().window().getSize();
        int a = (int) (dimension.width * 302);
        int b = (int) (dimension.height * 1366);
        int c = (int) (dimension.width *1064);
        int d = (int) (dimension.height * 1366);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(a,b)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(c,d)).release().perform();
    }

}
