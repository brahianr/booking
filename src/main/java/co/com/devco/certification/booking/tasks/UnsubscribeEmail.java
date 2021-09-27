package co.com.devco.certification.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.certification.booking.userinterfaces.CommunicationPreferencesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UnsubscribeEmail implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_UNSUBSCRIBE_EMAIL)
        );
    }

    public static UnsubscribeEmail forReservation(){
        return instrumented(UnsubscribeEmail.class);
    }
}
