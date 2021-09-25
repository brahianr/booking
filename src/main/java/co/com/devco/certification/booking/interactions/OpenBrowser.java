package co.com.devco.certification.booking.interactions;

import co.com.devco.certification.booking.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {
    HomePage homePage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(homePage)
        );
    }

    public static OpenBrowser onUrl(){
        return instrumented(OpenBrowser.class);
    }
}
