package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.TravelCompanionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.certification.booking.userinterfaces.TravelCompanionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterHis implements Task {

    private TravelCompanionModel travelCompanionModel;

    public EnterHis(TravelCompanionModel travelCompanionModel) {
        this.travelCompanionModel = travelCompanionModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_COMPANION),
                Enter.theValue(travelCompanionModel.getName()).into(TXT_NAME),
                Enter.theValue(travelCompanionModel.getLastname()).into(TXT_LASTNAME),
                Enter.theValue(travelCompanionModel.getBirthDay()).into(TXT_BIRTH_DAY),
                Enter.theValue(travelCompanionModel.getBirthMonth()).into(TXT_BIRTH_MONTH),
                Enter.theValue(travelCompanionModel.getBirthYear()).into(TXT_BIRTH_YEAR),
                Click.on(BTN_SAVE)
        );

    }

    public static EnterHis companionData(TravelCompanionModel travelCompanionModel){
        return instrumented(EnterHis.class,travelCompanionModel);
    }
}
