package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInPage {

    public static final Target TXT_USERNAME= Target.the("Username field").located(By.id("username"));
    public static final Target BTN_CONTINUEWITHEMAIL= Target.the("Continue with email button ").located(By.xpath("//span[contains(.,'Continuar con e-mail')]"));
    public static final Target TXT_NEWPASSWORD= Target.the("Password field").located(By.id("new_password"));
    public static final Target TXT_CONFIRMPASSWORD= Target.the("Password field").located(By.id("confirmed_password"));
    public static final Target BTN_CREATEACCOUNT= Target.the("Create account button").located(By.xpath("//span[contains(.,'Crear una cuenta')]"));
    public static final Target BTN_CAPTCHA= Target.the("Captcha button").located(By.xpath("//div[@aria-label='Mantén pulsado este botón para pasar el control de seguridad']"));
    public static final Target TXT_PASSWORD= Target.the("Captcha button").located(By.id("password"));
    public static final Target BTN_SIGNIN= Target.the("Create account button").located(By.xpath("//span[contains(.,'Iniciar sesión')]"));

}
