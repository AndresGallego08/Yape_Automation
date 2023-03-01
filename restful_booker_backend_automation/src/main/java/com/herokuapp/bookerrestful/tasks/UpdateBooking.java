package com.herokuapp.bookerrestful.tasks;

import com.herokuapp.bookerrestful.models.DataBooking;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static com.herokuapp.bookerrestful.utils.Constants.*;

public class UpdateBooking implements Task {
    private DataBooking dataBooking;

    public UpdateBooking(DataBooking dataBooking) {
        this.dataBooking = dataBooking;
        dataBooking.setBookingDates(dataBooking.getCheckin(), dataBooking.getCheckout());
    }

    public static UpdateBooking information(DataBooking dataBooking) {
        return Tasks.instrumented(UpdateBooking.class, dataBooking);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CreateAuth.token(),
                Put.to(BOOKING_PATH + actor.recall(BOOKING_ID))
                        .with(request -> request
                                .contentType(FORMAT_VALUE)
                                .accept(FORMAT_VALUE)
                                .header(COOKIE, "token=" + actor.recall(TOKEN))
                                .body(dataBooking)));
        System.out.println(SerenityRest.getDefaultRequestSpecification());
    }
}
