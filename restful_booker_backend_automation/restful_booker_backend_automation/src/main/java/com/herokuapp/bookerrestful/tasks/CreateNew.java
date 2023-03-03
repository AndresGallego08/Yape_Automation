package com.herokuapp.bookerrestful.tasks;

import com.herokuapp.bookerrestful.models.DataBooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.herokuapp.bookerrestful.utils.Constants.BOOKING_PATH;
import static com.herokuapp.bookerrestful.utils.Constants.FORMAT_VALUE;

public class CreateNew implements Task {

    private DataBooking dataBooking;

    public CreateNew(DataBooking dataBooking) {
        this.dataBooking = dataBooking;
        dataBooking.setBookingDates(dataBooking.getCheckin(), dataBooking.getCheckout());
    }

    public static CreateNew booking(DataBooking dataBooking) {
        return Tasks.instrumented(CreateNew.class, dataBooking);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(BOOKING_PATH)
                .with(request -> request
                        .contentType(FORMAT_VALUE)
                        .accept(FORMAT_VALUE)
                        .body(dataBooking)));
    }
}
