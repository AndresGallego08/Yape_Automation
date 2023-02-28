package com.herokuapp.bookerrestful.stepdefinitions;

import com.herokuapp.bookerrestful.models.DataBooking;
import com.herokuapp.bookerrestful.tasks.CreateNew;
import com.herokuapp.bookerrestful.tasks.GetBooking;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BookingStepDefinitions {

    @Before
    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled("CLIENT");
    }

    @Given("^the user prepares the service$")
    public void theUserPreparesTheService() {
        theActorInTheSpotlight().whoCan(CallAnApi.at("https://restful-booker.herokuapp.com"));
    }

    @When("^the user consumes the service booking ids$")
    public void theUserConsumesTheServiceBookingIds() {
        theActorInTheSpotlight().attemptsTo(GetBooking.listId());
    }

    @When("^the user sends data to create a new booking$")
    public void theUserSendsDataToCreateANewBooking(List<DataBooking> listDataBooking) {
        theActorInTheSpotlight().attemptsTo(CreateNew.booking(listDataBooking.get(0)));
    }
    @Then("^the user will get the code (.*)$")
    public void theUserWillGetTheCode(int code) {
        theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(response -> response.statusCode(code)));
    }


}
