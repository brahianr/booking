package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.interactions.SwitchToNew;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.certification.booking.userinterfaces.AccountSettingsPage.BTN_EMAIL_NOTIFICATION;
import static co.com.devco.certification.booking.userinterfaces.AccountSettingsPage.BTN_MANAGE_EMAIL_NOTIFICATION;
import static co.com.devco.certification.booking.userinterfaces.CommunicationPreferencesPage.BTN_RESERVATION;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_MANAGE_ACCOUNT;
import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_PROFILE_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterTheNotification implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PROFILE_MENU),
                Click.on(BTN_MANAGE_ACCOUNT),
                Click.on(BTN_EMAIL_NOTIFICATION),
                Click.on(BTN_MANAGE_EMAIL_NOTIFICATION),
                SwitchToNew.newTab(),
                Click.on(BTN_RESERVATION)
        );

    }

    public static EnterTheNotification forReservations(){
        return instrumented(EnterTheNotification.class);
    }
}
