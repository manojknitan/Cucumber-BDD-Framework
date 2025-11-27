package com.learning.stepDefinitions;

import com.learning.pageObjects.OrangeHomepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OrangeHRMSteps extends BaseClass{

    OrangeHomepage ohp;

    @Before
    public void setUp() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("./src//test//resources//config.properties");
        prop.load(fis);

        logger = Logger.getLogger(OrangeHRMSteps.class);

        String br = prop.getProperty("browser");

        if(br.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(br.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else {
            driver = new EdgeDriver();
        }

    }

    @Given("launch chrome browser")
    public void launch_chrome_browser() {
        //driver = new ChromeDriver();

        logger.info("************* Launching browser **************");
        ohp = new OrangeHomepage(driver);
    }

    @When("open web home page")
    public void open_web_home_page() {
        driver.get("https://www.orangehrm.com/");
        logger.info("************* Opening url **************");
    }

    @Then("verify if logo is present or not")
    public void verify_if_logo_is_present_or_not() {
        logger.info("************* Checking logo **************");
        boolean value = ohp.checkLogo();

        logger.info("************* checking logo completed **************");
        Assert.assertTrue(value);

        logger.info("************* verified and assertion completed **************");
    }

    @And("close browser")
    public void close_browser() {

        logger.info("************* closing browser **************");
        driver.quit();
    }
}
