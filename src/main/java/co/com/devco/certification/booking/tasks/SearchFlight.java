package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.FlightModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.booking.userinterfaces.FlightsPage.*;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_FLIGHTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchFlight implements Task {

    private FlightModel flightModel;

    public SearchFlight(FlightModel flightModel) {
        this.flightModel = flightModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FLIGHTS),
                //WaitUntil.the(BTN_ORIGIN, isVisible()).forNoMoreThan(5).seconds(),
                //Click.on(BTN_ORIGIN),
                JavaScriptClick.on(BTN_ORIGIN),
                Enter.theValue(flightModel.getOrigin()).into(LBL_ORIGIN),
                Click.on(LTS_ORIGIN),
                //JavaScriptClick.on(BTN_DESTINATION),
                Enter.theValue(flightModel.getDestination()).into(LBL_DESTINATION),
                Click.on(LTS_DESTINATION),
                Click.on(DP_CALENDAR_FLIGHT),
                Click.on(DP_DEPARTURE_DATE),
                Click.on(DP_ARRIVAL_DATE),
                Click.on(BTN_SEARCH_FLIGHT)


        );

    }

    public static SearchFlight onPage(FlightModel flightModel){
        return instrumented(SearchFlight.class,flightModel);
    }
}
