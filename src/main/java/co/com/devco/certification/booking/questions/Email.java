package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.CommunicationPreferencesPage.LBL_YOU_UNSUBSCRIBE;

public class Email implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_YOU_UNSUBSCRIBE.resolveFor(actor).isVisible();
    }

    public static Email wasUnsubscribed(){
        return new Email();
    }
}
