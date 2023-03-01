package com.herokuapp.bookerrestful.stepdefinitions;

import com.herokuapp.bookerrestful.tasks.GetApi;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PingStepDefinitions {
    @When("^the user consumes the HealthCheck$")
    public void theUserConsumesTheHealthCheck() {
        theActorInTheSpotlight().attemptsTo(GetApi.status());
    }
}
