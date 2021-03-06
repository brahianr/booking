package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.AirportTaxisModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.booking.userinterfaces.AirportTaxisPage.*;
import static co.com.devco.certification.booking.userinterfaces.AirtportTaxisResultPage.LBL_TAXI_RESTULT;
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
                Click.on(RDB_ROUND_TRIP),
                Enter.theValue(airportTaxisModel.getPickUpPlace()).into(TXT_PICKUP_PLACE),
                WaitUntil.the(LBL_PICKUP_PLACE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LBL_PICKUP_PLACE),
                Enter.theValue(airportTaxisModel.getDestination()).into(TXT_DROPOFF_PLACE),
                WaitUntil.the(LBL_DROPOFF_PLACE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LBL_DROPOFF_PLACE),
                Click.on(CLD_CALENDAR_AIRPORT_TAXI),
                Click.on(CLD_PICKUP_DATE.of(airportTaxisModel.getPickUpDate())),
                Click.on(BTN_PICKUP_TIME),
                SelectFromOptions.byVisibleText(airportTaxisModel.getPickUpTime()).from(LTS_PICKUP_HOUR)

        );
        actor.attemptsTo(
                Click.on(BTN_PICKUP_HOUR),
                SelectFromOptions.byVisibleText(airportTaxisModel.getPassengers()).from(LTS_PASSENGERS),
                Click.on(BTN_SEARCH_TAXI),
                WaitUntil.the(LBL_TAXI_RESTULT, isVisible()).forNoMoreThan(60).seconds()
        );
    }

    public static SearchTaxi forAirport(AirportTaxisModel airportTaxisModel){
        return instrumented(SearchTaxi.class,airportTaxisModel);
    }
}
