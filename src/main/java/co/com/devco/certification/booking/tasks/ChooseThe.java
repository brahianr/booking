package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.interactions.SwitchToNew;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.booking.userinterfaces.LodgingSearchResultPage.*;
import static co.com.devco.certification.booking.userinterfaces.ReservationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ChooseThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOWER_PRICE),
                WaitUntil.the(IMG_LOADING_RESULT, isNotCurrentlyVisible()).forNoMoreThan(5).seconds(),
                Click.on(IMG_FIRST_RESULT),
                SwitchToNew.newTab(),
                //Scroll.to(BTN_RESERVE),
                Click.on(BTN_RESERVE_NOW),
                SelectFromOptions.byValue("1").from(LTS_BED_NUMBER),
                WaitUntil.the(BTN_RESERVE, isClickable()).forNoMoreThan(3).seconds(),
                JavaScriptClick.on(BTN_RESERVE),
                Scroll.to(BTN_LATEST_DATA),
                Click.on(BTN_LATEST_DATA),
                Scroll.to(BTN_COMPLETE_RESERVATION),
                Click.on(BTN_COMPLETE_RESERVATION)

        );
    }

    public static ChooseThe lowestPricedHotel(){
        return instrumented(ChooseThe.class);
    }
}
