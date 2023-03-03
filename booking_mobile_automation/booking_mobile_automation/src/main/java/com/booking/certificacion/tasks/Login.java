package com.booking.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.booking.certificacion.userinterfaces.LoginPage.*;
import static com.booking.certificacion.utils.ConstantsCredentials.EMAIL;
import static com.booking.certificacion.utils.ConstantsCredentials.PASSWORD;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECT_ACOUNT_OPTION),
                Enter.theValue(EMAIL).into(EMAIL_INPUT),
                Click.on(CONTINUE_BTN),
                Enter.theValue(PASSWORD).into(PASSWORD_INPUT),
                Click.on(LOGIN_BTN));

    }


    public static Login onBooking() {
        return Tasks.instrumented(Login.class);
    }
}
