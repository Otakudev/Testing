package com.example.sites_ui_tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Gurman {
    public ChromeDriver driver;

    @Test
    public void Test_02() {
        driver.get("https://gurmand.md");
        driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
