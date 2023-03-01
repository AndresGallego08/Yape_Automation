package com.herokuapp.bookerrestful.stepdefinitions;

import com.herokuapp.bookerrestful.models.Credentials;
import com.herokuapp.bookerrestful.tasks.CreateAuth;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthStepDefinitions {

    @When("^the user sends the credentials to create a new auth token$")
    public void theUserSendsTheCredentialsToCreateANewAuthToken() {
        theActorInTheSpotlight().attemptsTo(CreateAuth.token());
    }
}
