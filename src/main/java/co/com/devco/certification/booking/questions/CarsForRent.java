package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.CarRentalResultPage.GVW_CAR_RENTAL_RESULT;

public class CarsForRent implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return GVW_CAR_RENTAL_RESULT.resolveFor(actor).isVisible();
    }

    public static CarsForRent areAvailable(){
        return new CarsForRent();
    }
}
