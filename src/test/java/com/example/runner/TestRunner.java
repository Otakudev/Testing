
package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( monochrome = true,

        features = "src/test/resources/features/",
        plugin=  { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },

        dryRun = false,
        glue = {"com.example.steps_definitions","fr.rattlier.cucumber"}


)
public class TestRunner extends AbstractTestNGCucumberTests {
}


