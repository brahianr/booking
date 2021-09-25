package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_LOGIN;
import static co.com.devco.certification.booking.userinterfaces.SignInPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    private UserModel userModel;

    public LogIn(UserModel userModel){
        this.userModel=userModel;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(userModel.getEmail()).into(TXT_USERNAME),
                Click.on(BTN_CONTINUEWITHEMAIL),
                Enter.theValue(userModel.getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_SIGNIN),
                Switch.toWindow("")




        );

    }

    public static LogIn withData(UserModel userModel){
        return instrumented(LogIn.class, userModel);
    }
}
