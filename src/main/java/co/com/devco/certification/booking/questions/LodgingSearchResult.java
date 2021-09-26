package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.LodgingSearchResultPage.LBL_LODGING_RESULT;

public class LodgingSearchResult implements Question<Boolean> {

    private String destination;

    public LodgingSearchResult(String destination) {
        this.destination = destination;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_LODGING_RESULT.resolveFor(actor).getText().contains(destination);
    }

    public static LodgingSearchResult onDestination(String destination){
        return new LodgingSearchResult(destination);

    }
}
