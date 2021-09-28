package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LodgingPage {

    public static final Target TXT_SEARCH = Target.the("Search field").located(By.id("ss"));
    public static final Target CLD_CALENDAR = Target.the("Calendar").located(By.xpath("//div[@data-mode='checkin']"));
    public static final Target CLD_CHECK_IN = Target.the("CheckIn Calendar").locatedBy("//td[@data-date='{0}']");
    public static final Target CLD_CHECK_OUT = Target.the("CheckOut calendar").locatedBy("//td[@data-date='{0}']");
    public static final Target BTN_SEARCH = Target.the("Search Button").located(By.xpath("//button[@data-sb-id='main']"));
}
