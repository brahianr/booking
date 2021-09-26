package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AirtportTaxisResultPage {

    public static final Target LBL_TAXI_RESTULT = Target.the("").located(By.xpath("//h2[contains(.,'Elige un taxi')]"));
}
