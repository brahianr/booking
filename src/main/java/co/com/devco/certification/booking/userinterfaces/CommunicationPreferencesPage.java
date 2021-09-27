package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommunicationPreferencesPage {

    public static final Target BTN_RESERVATION=Target.the("").located(By.xpath("//button[@title='Reservas']"));
    public static final Target CHK_RESERVATION_EMAIL=Target.the("").located(By.xpath("//label[@for='reservation___emails']//span"));
    public static final Target BTN_UNSUBSCRIBE_EMAIL=Target.the("").located(By.xpath("//span[contains(.,'Darse de baja de todos los e-mails de reserva')]"));
    public static final Target LLBL_YOU_UNSUBSCRIBE=Target.the("").located(By.xpath("//h1[contains(.,'Te has dado de baja')]"));
}
