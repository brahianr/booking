package co.com.devco.certification.booking.questions;

import co.com.devco.certification.booking.models.TravelCompanionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.TravelCompanionPage.LBL_COMPANION_NAME;

public class CompanionData implements Question<Boolean> {

    private String name;

    public CompanionData(String name) {
        this.name = name;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_COMPANION_NAME.of(name).resolveFor(actor).isVisible();
    }

    public static CompanionData added(String name){
        return  new CompanionData(name);
    }


}
