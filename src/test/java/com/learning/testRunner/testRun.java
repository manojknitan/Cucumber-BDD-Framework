package com.learning.testRunner;

import io.cucumber.java.an.Cuan;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//features/Customers.feature",
        glue = "com.learning.stepDefinitions",
        dryRun = true,
        monochrome = true,
        plugin = {"pretty","html:test-output"}
)
public class testRun {
}
