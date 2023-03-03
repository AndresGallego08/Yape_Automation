package com.herokuapp.bookerrestful.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.herokuapp.bookerrestful.utils.Constants.BOOKING_ID;
import static com.herokuapp.bookerrestful.utils.Constants.BOOKING_PATH;

public class GetSpecific implements Task {

    public static GetSpecific booking() {
        return Tasks.instrumented(GetSpecific.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(BOOKING_PATH + actor.recall(BOOKING_ID))
                .with(request -> request));
    }
}
