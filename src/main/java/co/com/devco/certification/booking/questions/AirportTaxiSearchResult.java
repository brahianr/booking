package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.booking.userinterfaces.AirtportTaxisResultPage.LBL_TAXI_RESTULT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AirportTaxiSearchResult implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return LBL_TAXI_RESTULT.resolveFor(actor).isVisible();
    }

    public static AirportTaxiSearchResult showAvailableOnes(){
        return new AirportTaxiSearchResult();
    }
}
