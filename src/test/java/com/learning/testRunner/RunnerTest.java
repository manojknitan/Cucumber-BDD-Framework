package com.learning.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//MKnitan//Desktop//Automation//cucumber-framework//features//OrangeHRM.feature",
        glue = "com.learning.stepDefinitions",
        //dryRun = true,
        monochrome = true,
        plugin = {"pretty",
                "html:test-report.html"},
        tags = "@sanity"
)
public class RunnerTest {
}
