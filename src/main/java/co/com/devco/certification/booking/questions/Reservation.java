package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.ReservationPage.LBL_CONFIRMED_RESERVATION;

public class Reservation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMED_RESERVATION.resolveFor(actor).isVisible();
    }

    public static Reservation isConfirmed(){
        return new Reservation();
    }
}
