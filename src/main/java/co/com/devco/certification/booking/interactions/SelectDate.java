package co.com.devco.certification.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.interactions.Actions;

import static co.com.devco.certification.booking.userinterfaces.FlightsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDate implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(BTN_DESTINATION),
                //JavaScriptClick.on(BTN_DESTINATION),
                MoveMouse.to(BTN_DESTINATION).andThen(Actions::doubleClick),
                //Enter.theValue(flightModel.getDestination()).into(LBL_DESTINATION),
                Click.on(LTS_DESTINATION),
                Click.on(DP_CALENDAR_FLIGHT),
                Click.on(DP_DEPARTURE_DATE),
                Click.on(DP_ARRIVAL_DATE),
                Click.on(BTN_SEARCH_FLIGHT)
        );
    }

    public static SelectDate destination(){
        return instrumented(SelectDate.class);
    }
}
