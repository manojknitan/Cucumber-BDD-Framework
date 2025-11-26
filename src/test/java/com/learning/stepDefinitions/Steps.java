package com.learning.stepDefinitions;

import com.learning.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {

    public WebDriver driver;
    public LoginPage lp;

    @Given("launch the browser")
    public void launch_browser() {
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }

    @When("open url {string}")
    public void open_url(String url) {
        driver.get(url);
    }

    @And("enter email as {string} and password {string}")
    public void enterEmailAsAndPassword(String email, String pwd) {
        lp.setUserName(email);
        lp.setPassword(pwd);
    }

    @When("click to login")
    public void click_to_login() {
        lp.clickLogin();
    }

    @Then("page title displayed or not? {string}")
    public void page_title_should_be(String title) {
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }
        else {
            Assert.assertEquals(title, driver.getTitle());
        }

    }
    @When("click on logout")
    public void click_on_logout() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(30);
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}
