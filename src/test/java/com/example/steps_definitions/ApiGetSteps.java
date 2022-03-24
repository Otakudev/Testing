package com.example.steps_definitions;

import com.example.actions.api.ApiGetActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiGetSteps {
    private final ApiGetActions apiGetActions = new ApiGetActions();

    @When("User does GET request")
    public void user_does_get_request() {
        apiGetActions.doGetRequest();

    }

    @Then("User receives lists of posts")
    public void user_receives_lists_of_posts() {
        apiGetActions.validateGetRequest();
    }
}
