package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.utils.SaveName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_FAVOTIRES;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_PROFILE_MENU;
import static co.com.devco.certification.booking.userinterfaces.LodgingSearchResultPage.BTN_FAVORITE_FIRST_RESULT;
import static co.com.devco.certification.booking.utils.Constants.FAVORITE_HOTEL_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddLodging implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(FAVORITE_HOTEL_NAME, SaveName.favorite());

        actor.attemptsTo(
                Click.on(BTN_FAVORITE_FIRST_RESULT),
                Click.on(BTN_PROFILE_MENU),
                Click.on(BTN_FAVOTIRES)
        );

    }

    public static AddLodging toFavorites(){
        return instrumented(AddLodging.class);
    }
}
