package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.FavoritePage.LBL_ELEMENT_FAVORITE;
import static co.com.devco.certification.booking.utils.Constants.FAVORITE_HOTEL_NAME;

public class ViewTheItem implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ELEMENT_FAVORITE.resolveFor(actor).containsText(actor.recall(FAVORITE_HOTEL_NAME));
    }

    public static ViewTheItem inFavorites(){
        return new ViewTheItem();
    }
}
