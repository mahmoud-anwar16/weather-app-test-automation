package com.qpros;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private static final long WAIT = 20;
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibility(By by) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void clickElement(By by) {
        driver.findElement(by).click();
    }

    protected String getElementText(By by) {
        return driver.findElement(by).getText();
    }
}
