package com.learning.pageObjects;

import com.learning.stepDefinitions.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomepage extends BaseClass {

    public OrangeHomepage(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/a[1]/img[1]")
    WebElement txtLogo;

    public boolean checkLogo()
    {
        return txtLogo.isDisplayed();
    }
}
