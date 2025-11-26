package com.learning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver1)
    {
        driver = driver1;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement txtEmail;

    @FindBy(id = "Password")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement lnkLogout;

    public void setUserName(String name)
    {
        txtEmail.clear();
        txtEmail.sendKeys(name);
    }

    public void setPassword(String pwd){
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public void clickLogout(){
        lnkLogout.click();
    }
}
