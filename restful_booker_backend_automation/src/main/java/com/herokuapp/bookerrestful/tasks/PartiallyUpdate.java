package com.herokuapp.bookerrestful.tasks;

import com.herokuapp.bookerrestful.models.DataBooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;

import static com.herokuapp.bookerrestful.utils.Constants.*;

public class PartiallyUpdate implements Task {

    private DataBooking dataBooking;

    public PartiallyUpdate(DataBooking dataBooking) {
        this.dataBooking = dataBooking;
    }

    public static PartiallyUpdate aBooking(DataBooking dataBooking) {
        return Tasks.instrumented(PartiallyUpdate.class, dataBooking);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CreateAuth.token(),
                Patch.to(BOOKING_PATH + actor.recall(BOOKING_ID))
                .with(request -> request
                        .contentType(FORMAT_VALUE)
                        .accept(FORMAT_VALUE)
                        .header(COOKIE, "token=" + actor.recall(TOKEN))
                        .body(dataBooking)));
    }
}
