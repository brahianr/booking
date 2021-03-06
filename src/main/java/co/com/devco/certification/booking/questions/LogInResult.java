package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_NOTIFICATIONS;

public class LogInResult implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_NOTIFICATIONS.resolveFor(actor).isVisible();
    }

    public static LogInResult successful(){
        return new LogInResult();
    }
}
