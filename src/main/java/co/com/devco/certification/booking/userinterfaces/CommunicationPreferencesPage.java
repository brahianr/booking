package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommunicationPreferencesPage {

    public static final Target BTN_RESERVATION=Target.the("Reservation button").located(By.xpath("//button[@title='Reservas']"));
    public static final Target BTN_UNSUBSCRIBE_EMAIL=Target.the("Unsubscribe email button").located(By.xpath("//span[contains(.,'Darse de baja de todos los e-mails de reserva')]"));
    public static final Target LBL_YOU_UNSUBSCRIBE=Target.the("Unsubscribe label message").located(By.xpath("//h1[contains(.,'Te has dado de baja')]"));
}
