package co.com.devco.certification.booking.tasks;

import co.com.devco.certification.booking.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.certification.booking.userinterfaces.HomePage.BTN_CREATE_ACCOUNT;
import static co.com.devco.certification.booking.userinterfaces.SignInPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccount implements Task {

    private UserModel userModel;

    public CreateAccount(UserModel userModel){
        this.userModel=userModel;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CREATE_ACCOUNT),
                Enter.theValue(userModel.getEmail()).into(TXT_USERNAME),
                Click.on(BTN_CONTINUEWITHEMAIL),
                Enter.theValue(userModel.getPassword()).into(TXT_NEWPASSWORD),
                Enter.theValue(userModel.getPassword()).into(TXT_CONFIRMPASSWORD),
                Click.on(BTN_CREATEACCOUNT)
        );
    }

    public static CreateAccount withData(UserModel userModel){
        return instrumented(CreateAccount.class,userModel);
    }
}
