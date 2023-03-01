package com.herokuapp.bookerrestful.stepdefinitions;

import com.herokuapp.bookerrestful.models.DataBooking;
import com.herokuapp.bookerrestful.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

import static com.herokuapp.bookerrestful.utils.Constants.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BookingStepDefinitions {

    @Before
    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled("CLIENT");
    }

    @Given("^the user prepares the service$")
    public void theUserPreparesTheService() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
    }

    @Given("^the user gets the existing booking id$")
    public void theUserGetsTheExistingBookingId() {
        theActorInTheSpotlight().wasAbleTo(GetBooking.listId());
    }

    @When("^the user consumes the service booking ids$")
    public void theUserConsumesTheServiceBookingIds() {
        theActorInTheSpotlight().attemptsTo(GetBooking.listId());
    }

    @When("^the user consumes the service booking with specific id$")
    public void theUserConsumesTheServiceBookingWithSpecificId() {
        theActorInTheSpotlight().attemptsTo(GetSpecific.booking());
    }

    @When("^the user sends data to create a new booking$")
    public void theUserSendsDataToCreateANewBooking(List<DataBooking> listDataBooking) {
        theActorInTheSpotlight().attemptsTo(CreateNew.booking(listDataBooking.get(0)));
    }

    @When("^the user sends data to update an existing booking$")
    public void theUserSendsDataToUpdateAnExistingBooking(List<DataBooking> listDataBooking) {
        theActorInTheSpotlight().attemptsTo(UpdateBooking.information(listDataBooking.get(0)));
    }

    @When("^the user sends data to update partially an existing booking$")
    public void theUserSendsDataToUpdatePartiallyAnExistingBooking(List<DataBooking> listDataBooking) {
        theActorInTheSpotlight().attemptsTo(PartiallyUpdate.aBooking(listDataBooking.get(0)));
    }

    @When("^the user authorizes delete an existing booking$")
    public void theUserAuthorizesDeleteAnExistingBooking() {
        theActorInTheSpotlight().attemptsTo(Delete.aBooking());
    }

    @Then("^the user will get the status code (.*)$")
    public void theUserWillGetTheStatusCode(int code) {
        theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(response -> response.statusCode(code)));
    }
}
