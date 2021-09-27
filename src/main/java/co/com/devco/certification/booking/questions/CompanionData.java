package co.com.devco.certification.booking.questions;

import co.com.devco.certification.booking.models.TravelCompanionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.TravelCompanionPage.LBL_COMPANION_NAME;

public class CompanionData implements Question<Boolean> {

    private TravelCompanionModel travelCompanionModel;
    private String name;

    public CompanionData(String name) {
        this.name = name;
    }

    /*public CompanionData(TravelCompanionModel travelCompanionModel) {
        this.travelCompanionModel = travelCompanionModel;
    }*/

    @Override
    public Boolean answeredBy(Actor actor) {
        //return LBL_COMPANION_NAME.of(travelCompanionModel.getName()).resolveFor(actor).isVisible();
        return LBL_COMPANION_NAME.of(name).resolveFor(actor).isVisible();
    }

    public static CompanionData added(String name){
        return  new CompanionData(name);
    }

    /*public static CompanionData added(TravelCompanionModel travelCompanionModel){
        return  new CompanionData(travelCompanionModel);
    }*/
}
