package co.com.devco.certification.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.booking.userinterfaces.HomePage.LBL_WELCOME_MESSAGE;

public class Register implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_WELCOME_MESSAGE.resolveFor(actor).isVisible();
    }

    public static Register isSuccessful(){
        return new Register();
    }
}
