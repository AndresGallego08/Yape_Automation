package com.herokuapp.bookerrestful.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetBooking implements Task {

    public static GetBooking listId() {
        return Tasks.instrumented(GetBooking.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource("/booking")
                .with(request -> request));
    }
}
