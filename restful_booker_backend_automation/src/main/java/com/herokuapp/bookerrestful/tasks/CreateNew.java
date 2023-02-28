package com.herokuapp.bookerrestful.tasks;

import com.herokuapp.bookerrestful.models.DataBooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

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
        System.out.println(dataBooking.toString());
        actor.attemptsTo(Post.to("/booking")
                .with(request -> request
                        .header("Content-Type", "application/json")
                        .accept("application/json")
                        .body(dataBooking)));
    }
}
