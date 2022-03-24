package com.example.steps_definitions;

import com.example.actions.ui.FoodTestActions;
import com.example.actions.ui.GurmanTestActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FoodTestSteps {
    private final FoodTestActions foodTestActions;

    public FoodTestSteps(FoodTestActions foodTestActions){
        this.foodTestActions = foodTestActions;
    }

    @Given(": The user open the main page of FoodHouse")
    public void theUserOpenTheMainPageOfShop() {
        foodTestActions.openMainPage();
    }

    @When(":  The user choose the product needed")
    public void theUserChooseTheProductNeeded() {
        foodTestActions.addSpecialProducts();
    }

    @Then(":  The User open the shopping cart")
    public void theUserOpenTheShoppingCart() {
        foodTestActions.validateProductsAreDisplayed();
    }

    @And(": The user check there are the correct products and prices")
    public void theUserCheckThereAreTheCorrectProductsAndPrices() {
        foodTestActions.validateResultsAreShown();
    }
}
