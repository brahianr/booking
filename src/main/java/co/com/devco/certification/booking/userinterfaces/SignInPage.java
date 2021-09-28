package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInPage {

    public static final Target TXT_USERNAME= Target.the("Username field").located(By.id("username"));
    public static final Target BTN_CONTINUEWITHEMAIL= Target.the("Continue with email button ").located(By.xpath("//span[contains(.,'Continuar con e-mail')]"));
    public static final Target TXT_PASSWORD= Target.the("Password field").located(By.id("password"));
    public static final Target BTN_SIGNIN= Target.the("SignIn button").located(By.xpath("//span[contains(.,'Iniciar sesión')]"));

}
