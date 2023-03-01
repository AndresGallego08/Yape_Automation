package com.herokuapp.bookerrestful.tasks;

import com.herokuapp.bookerrestful.models.Credentials;
import com.herokuapp.bookerrestful.models.DataBooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.herokuapp.bookerrestful.utils.Constants.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class CreateAuth implements Task {

    private Credentials credentials = new Credentials();

    public static CreateAuth token() {
        return Tasks.instrumented(CreateAuth.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(AUTH_PATH)
                .with(request -> request
                        .contentType(FORMAT_VALUE)
                        .accept(FORMAT_VALUE)
                        .body(credentials)));
        actor.remember(TOKEN, lastResponse().body().jsonPath().get(TOKEN).toString());
    }
}
