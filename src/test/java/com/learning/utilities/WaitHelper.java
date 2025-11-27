package com.learning.utilities;

import com.learning.stepDefinitions.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper extends BaseClass {

    public WaitHelper(WebDriver webDriver){
        driver = webDriver;
    }

    public void WaitForElement(WebElement element, long timeOutInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSec));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
