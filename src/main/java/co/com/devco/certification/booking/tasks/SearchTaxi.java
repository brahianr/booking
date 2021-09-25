package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.AirportTaxisModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.booking.userinterfaces.AirportTaxisPage.*;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_AIRPORT_TAXI;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SearchTaxi implements Task {

    private AirportTaxisModel airportTaxisModel;

    public SearchTaxi(AirportTaxisModel airportTaxisModel) {
        this.airportTaxisModel = airportTaxisModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AIRPORT_TAXI),
                Enter.theValue(airportTaxisModel.getPickUpPlace()).into(TXT_PICKUP_PLACE),
                WaitUntil.the(LBL_PICKUP_PLACE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LBL_PICKUP_PLACE),
                Enter.theValue(airportTaxisModel.getDestination()).into(TXT_DROPOFF_PLACE),
                WaitUntil.the(LBL_DROPOFF_PLACE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LBL_DROPOFF_PLACE),
                Click.on(DP_CALENDAR_AIRPORT_TAXI),
                Click.on(DP_PICKUP_DATE),
                Click.on(BTN_PICKUP_TIME),
                SelectFromOptions.byVisibleText(airportTaxisModel.getPickUpTime()).from(LTS_PICKUP_HOUR),
                Click.on(BTN_PICKUP_HOUR),
                SelectFromOptions.byVisibleText(airportTaxisModel.getPassengers()).from(LTS_PASSENGERS),
                Click.on(BTN_SEARCH_TAXI)
        );

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static SearchTaxi forAirport(AirportTaxisModel airportTaxisModel){
        return instrumented(SearchTaxi.class,airportTaxisModel);
    }
}
