package com.booking.certificacion.tasks;

import com.booking.certificacion.models.ReservationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.booking.certificacion.userinterfaces.ReservationPage.*;

public class BookHotel implements Task {

    private ReservationData reservationData;

    public BookHotel(ReservationData reservationData) {
        this.reservationData = reservationData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLICK_DESTINATION_INPUT),
                Enter.theValue(reservationData.getDestination()).into(DESTINATION_INPUT),
                Click.on(SELECT_DESTINATION),
                Click.on(DATE.of(reservationData.getCheckInDate())),
                Click.on(DATE.of(reservationData.getCheckOutDate())),
                Click.on(SELECT_DATES_BTN),
                Click.on(APPLY_BTN),
                Click.on(SEARCH_BTN)
        );

    }

    public static BookHotel stay(ReservationData reservationData) {
        return Tasks.instrumented(BookHotel.class, reservationData);
    }
}
