package com.example.steps_definitions;


import com.example.actions.ui.GurmanTestActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GurmanTestSteps {
    private final GurmanTestActions gurmanTestActions;

    public GurmanTestSteps(GurmanTestActions gurmanTestActions) {
        this.gurmanTestActions = gurmanTestActions;
    }

    @Given("User open the main page of gurman")
    public void theUserOpenTheMainPageOfSite() {
        gurmanTestActions.openMainPage();
    }

    @When("User search by keyword {string}")
    public void theUserSearchByKeyword(String query) {
        gurmanTestActions.searchFor(query);
    }

    @Then("User the valid search results are displayed by keyword related on the title")
    public void theUserCheckTheOurResultsAreDisplayedByKeywordRelatedOnTheTitle() {
        gurmanTestActions.validateProperResultsAreDisplayed();
    }


}
