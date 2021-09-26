package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.CarRentalModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static co.com.devco.certification.booking.userinterfaces.CarRentalPage.*;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_CAR_RENTAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SearchCar implements Task {

    private CarRentalModel carRentalModel;

    public SearchCar(CarRentalModel carRentalModel) {
        this.carRentalModel = carRentalModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CAR_RENTAL),
                Click.on(RDB_RETURN_ANOTHER_PLACE),
                Click.on(TXT_PICKUP_PLACE_CAR),
                Enter.theValue(carRentalModel.getPickUpPlace()).into(TXT_PICKUP_PLACE_CAR),
                WaitUntil.the(LTS_FIRST_RESULT_PICKUP_CAR, isCurrentlyVisible()).forNoMoreThan(5).seconds(),
                Hit.the(Keys.ENTER).into(TXT_PICKUP_PLACE_CAR),
                Click.on(LTS_FIRST_RESULT_PICKUP_CAR),
                Click.on(TXT_DROPOFF_PLACE_CAR),
                Enter.theValue(carRentalModel.getDestinationPlace()).into(TXT_DROPOFF_PLACE_CAR),
                WaitUntil.the(LTS_FIRST_RESULT_DROPOFF_CAR, isCurrentlyVisible()).forNoMoreThan(5).seconds(),
                Hit.the(Keys.ENTER).into(TXT_DROPOFF_PLACE_CAR),
                Click.on(LTS_FIRST_RESULT_DROPOFF_CAR),
                Click.on(CLD_CALENDAR_CAR_RENTAL),
                Click.on(CLD_DEPARTURE_DATE_CAR_RENTAL.of(carRentalModel.getPickUpMonth(),carRentalModel.getPickUpDay())),
                Click.on(CLD_ARRIVAL_DATE_CAR_RENTAL.of(carRentalModel.getReturnMonth(),carRentalModel.getReturnDay())),
                Click.on(BTN_SEARCH_CAR_RENTAL)
        );
    }

    public static SearchCar forRental(CarRentalModel carRentalModel){
        return instrumented(SearchCar.class,carRentalModel);
    }
}
