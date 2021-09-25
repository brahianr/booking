package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("https://www.booking.com/")
public class HomePage extends PageObject {

    public static final Target BTN_CREATE_ACCOUNT= Target.the("Create account bitton").located(By.xpath("//span[contains(.,'Hazte una cuenta')]"));
    public static final Target BTN_LOGIN= Target.the("Create account bitton").located(By.xpath("//span[contains(.,'Inicia sesión')]"));
    public static final Target LBL_WELCOME_MESSAGE=Target.the("").located(By.id("//h2[@id='genius-onboarding-title']"));
    public static final Target BTN_NOTIFICATIONS=Target.the("").located(By.xpath("//button[@data-text='Ver tus notificaciones']"));
    public static final Target BTN_FLIGHTS=Target.the("").located(By.xpath("//a[@data-decider-header='flights']"));
    public static final Target BTN_CAR_RENTAL=Target.the("").located(By.xpath("//a[@data-decider-header='bookinggo']"));
}
