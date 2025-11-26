package com.learning.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("launch chrome browser")
    public void launch_chrome_browser() {
        driver = new ChromeDriver();
    }

    @When("open web home page")
    public void open_web_home_page() {
        driver.get("https://www.orangehrm.com/");
    }

    @Then("verify if logo is present or not")
    public void verify_if_logo_is_present_or_not() {
        boolean value = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/a[1]/img[1]")).isDisplayed();
        Assert.assertTrue(value);
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}
