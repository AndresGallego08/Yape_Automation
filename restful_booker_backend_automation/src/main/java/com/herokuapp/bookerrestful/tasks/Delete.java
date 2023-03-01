package com.herokuapp.bookerrestful.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.herokuapp.bookerrestful.utils.Constants.*;
import static net.serenitybdd.screenplay.rest.interactions.Delete.from;

public class Delete implements Task {

    public static Delete aBooking() {
        return Tasks.instrumented(Delete.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CreateAuth.token(),
                from(BOOKING_PATH + actor.recall(BOOKING_ID))
                .with(request -> request
                        .contentType(FORMAT_VALUE)
                        .accept(FORMAT_VALUE)
                        .header(COOKIE, "token=" + actor.recall(TOKEN))));
    }
}
