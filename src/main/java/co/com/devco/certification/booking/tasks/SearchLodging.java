package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.HotelReservationModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.devco.certification.booking.userinterfaces.LodgingPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchLodging implements Task {

    private HotelReservationModel hotelReservationModel;

    public SearchLodging(HotelReservationModel hotelReservationModel){
        this.hotelReservationModel=hotelReservationModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SEARCH, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(hotelReservationModel.getDestination()).into(TXT_SEARCH),
                Click.on(DP_CALENDAR),
                Click.on(DP_CHECK_IN.of(hotelReservationModel.getCheckIn())),
                Click.on(DP_CHECK_OUT.of(hotelReservationModel.getCheckOut())),
                Click.on(BTN_SEARCH)


        );

    }

    public static SearchLodging onPage(HotelReservationModel hotelReservationModel){
        return instrumented(SearchLodging.class, hotelReservationModel);
    }
}
