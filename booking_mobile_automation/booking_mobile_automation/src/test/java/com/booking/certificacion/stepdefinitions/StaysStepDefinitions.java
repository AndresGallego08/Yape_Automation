package com.booking.certificacion.stepdefinitions;

import com.booking.certificacion.models.ReservationData;
import com.booking.certificacion.tasks.BookHotel;
import com.booking.certificacion.tasks.Login;
import com.booking.certificacion.utils.DriverMobile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class StaysStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverMobile.booking())));
        OnStage.theActorCalled("Buyer");
    }

    @Given("^the user is on the stays page$")
    public void theUserIsOnTheStaysPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.onBooking());
    }

    @When("^he enters the reservation information$")
    public void heEntersTheReservationInformation(List<ReservationData> reservationDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(BookHotel.stay(reservationDataList.get(0)));
    }

    @Then("^he will see the reservation information$")
    public void heWillSeeTheReservationInformation() {

    }
}
