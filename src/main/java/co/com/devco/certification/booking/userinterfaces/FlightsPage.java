package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightsPage {

    public static final Target BTN_ORIGIN =Target.the("").located(By.xpath("//div[@data-placeholder='Origen' and @aria-label='Origen']//div//div"));
    public static final Target LBL_ORIGIN =Target.the("").located(By.xpath("//input[contains(@id,'origin-airport')]"));
    public static final Target LTS_ORIGIN =Target.the("").located(By.xpath("//input[contains(@id,'origin-airport')]//following::ul//following::ul"));
    public static final Target BTN_DESTINATION =Target.the("").located(By.xpath("//div[contains(@id,'destination-airport')]//div"));
    public static final Target LBL_DESTINATION  =Target.the("").located(By.xpath("//input[contains(@id,'destination-airport')]"));
    public static final Target LTS_DESTINATION  =Target.the("").located(By.xpath("//input[contains(@id,'destination-airport')]//following::ul//following::ul"));
    public static final Target DP_CALENDAR_FLIGHT  =Target.the("").located(By.xpath("//div[@aria-label='Fecha de ida']"));
    public static final Target DP_DEPARTURE_DATE =Target.the("").located(By.xpath("//div[@aria-label='octubre 1']"));
    public static final Target DP_ARRIVAL_DATE  =Target.the("").located(By.xpath("//div[@aria-label='octubre 10']"));
    public static final Target BTN_SEARCH_FLIGHT =Target.the("").located(By.xpath("//span[contains(.,'Buscar')]"));


}
