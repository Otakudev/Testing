package com.example.actions.ui;

import com.example.pom.gurman.HomePage;
import com.example.steps_definitions.Hooks;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;

public class FoodTestActions {
    public void openMainPage(){
        HomePage homePage = new HomePage(Hooks.getDriver());
        Hooks.getDriver().get("https://foodhouse.md");
    }
    public void addSpecialProducts(){
        Hooks.getDriver().findElement(By.xpath(".//*[@id=prod-image-26300']/a")).sendKeys();
        Hooks.getDriver().findElement(By.xpath(".//*[@span='Заказать']/a")).click();
        Hooks.getDriver().findElement(By.xpath(".//*[@id=prod-image-26300']/a")).sendKeys();
        Hooks.getDriver().findElement(By.xpath(".//*[@span='Заказать']/a")).click();

    }
    public void validateProductsAreDisplayed(){
         Hooks.getDriver().findElement(By.xpath(".//*[@class=order-confirm']/a")).click();

    }
    public void validateResultsAreShown(){
        Hooks.getDriver().findElement(By.xpath(".//*[@class=order-results-wrapper']/a")).sendKeys();

    }
}
