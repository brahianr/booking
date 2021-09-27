package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.TravelCompanionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.certification.booking.userinterfaces.AccountSettingsPage.BTN_TRAVEL_COMPANION;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_MANAGE_ACCOUNT;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_PROFILE_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToOption implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PROFILE_MENU),
                Click.on(BTN_MANAGE_ACCOUNT),
                Click.on(BTN_TRAVEL_COMPANION)
        );
    }

    public static GoToOption addTravelCompanion(){
        return instrumented(GoToOption.class);
    }
}
