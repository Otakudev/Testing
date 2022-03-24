package com.example.steps_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    private static WebDriver driver;

    public Hooks() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");

    }

    @Before
    public void initialiseDriver() {
        driver = new ChromeDriver();

    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
