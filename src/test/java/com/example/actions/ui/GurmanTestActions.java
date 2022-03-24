package com.example.actions.ui;

import com.example.pom.gurman.HomePage;
import com.example.steps_definitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GurmanTestActions {
    public void searchFor(String query) {
        HomePage homePage = new HomePage(Hooks.getDriver());
        homePage.getSearchInput.sendKeys("Pegas");
    }

    public void validateProperResultsAreDisplayed() {
        new WebDriverWait(Hooks.getDriver(), 10L).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                String pegas = null;
                String titleStartsWith = pegas;
                return d.getTitle().startsWith(titleStartsWith);
            }
        });
    }

    public void openMainPage() {
        Hooks.getDriver().get("https://gurmand.md");
    }
}