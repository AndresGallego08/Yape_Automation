package com.herokuapp.bookerrestful.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.requirements.reports.ScenarioOutcome;

import static com.herokuapp.bookerrestful.utils.Constants.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class GetBooking implements Task {

    public static GetBooking listId() {
        return Tasks.instrumented(GetBooking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(BOOKING_PATH)
                .with(request -> request));
        actor.remember(BOOKING_ID, lastResponse().body().jsonPath().getList(BOOKING_ID).get(0).toString());
    }
}
