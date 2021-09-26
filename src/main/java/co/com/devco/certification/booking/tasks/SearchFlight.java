package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.interactions.SelectDate;
import co.com.devco.certification.booking.models.FlightModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Actions;

import static co.com.devco.certification.booking.userinterfaces.AirportTaxisPage.LTS_PICKUP_HOUR;
import static co.com.devco.certification.booking.userinterfaces.FlightsPage.*;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_FLIGHTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SearchFlight implements Task {

    private FlightModel flightModel;

    public SearchFlight(FlightModel flightModel) {
        this.flightModel = flightModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FLIGHTS),
                Click.on(BTN_FLIGHTS),
                //WaitUntil.the(BTN_CLOSE, isVisible()).forNoMoreThan(5).seconds(),
                //MoveMouse.to(BTN_SEARCH_FLIGHT),
                //MoveMouse.to(BTN_CLOSE),
                //MoveMouse.to(BTN_CLOSE).andThen(Actions::click),
                //Click.on(BTN_CLOSE),
                //JavaScriptClick.on(BTN_CLOSE),
                JavaScriptClick.on(BTN_TRIP),
                Click.on(LTS_TRIP)
                //SelectDate.destination()

        );
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        actor.attemptsTo(
                //Click.on(BTN_ORIGIN),
                //JavaScriptClick.on(BTN_ORIGIN),
                MoveMouse.to(BTN_ORIGIN).andThen(Actions::clickAndHold).andThen(Actions::doubleClick),
                Enter.theValue(flightModel.getOrigin()).into(LBL_ORIGIN),
                Click.on(LTS_ORIGIN)
        );
        actor.attemptsTo(
                //Click.on(BTN_DESTINATION),
                //JavaScriptClick.on(BTN_DESTINATION),
                MoveMouse.to(BTN_DESTINATION).andThen(Actions::click).andThen(Actions::doubleClick),
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
