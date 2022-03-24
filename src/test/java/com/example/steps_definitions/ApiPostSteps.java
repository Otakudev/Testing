package com.example.steps_definitions;

import com.example.actions.api.ApiPostActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiPostSteps {
    private final ApiPostActions apiPostActions = new ApiPostActions();

    @Given("Create post with valid data")
    public void createPostWithValidData() {
        apiPostActions.createPost();
    }

    @When("Send http post request")
    public void sendHttpPostRequest() {
        apiPostActions.sendPostRequest();
    }

    @Then("Check status response")
    public void checkStatusResponse() {
        apiPostActions.checkStatusCode();
    }

    @And("Check body response")
    public void checkBodyResponse() {
        apiPostActions.checkProperBody();
    }
}
