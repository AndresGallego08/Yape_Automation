package com.herokuapp.bookerrestful.tasks;

import com.herokuapp.bookerrestful.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetApi implements Task {

    public static GetApi status() {
        return Tasks.instrumented(GetApi.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(Constants.PING_PATH)
                .with(request -> request));
    }
}
