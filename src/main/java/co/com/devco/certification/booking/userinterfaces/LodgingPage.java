package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LodgingPage {

    public static final Target TXT_SEARCH = Target.the("").located(By.id("ss"));
    public static final Target LTS_OPTION_SEARCH = Target.the("").located(By.xpath("//input[@id='ss']//following::ul/li"));
    public static final Target DP_CALENDAR = Target.the("").located(By.xpath("//div[@data-mode='checkin']"));
    public static final Target DP_CHECK_IN = Target.the("").locatedBy("//td[@data-date='{0}']");
    public static final Target DP_CHECK_OUT = Target.the("").locatedBy("//td[@data-date='{0}']");
    public static final Target LBL_GUESTS = Target.the("").located(By.id("xp__guests__toggle"));
    public static final Target BTN_SEARCH = Target.the("").located(By.xpath("//button[@data-sb-id='main']"));
    public static final Target IMG_FIRST_RESULT = Target.the("").located(By.xpath("//div[@data-et-click='customGoal:NAREFBINEIfBccOHT:2']/div"));
    public static final Target BTN_RESERVE_NOW = Target.the("").located(By.id("hp_book_now_button"));
    public static final Target BTN_RESERVE_WITH_DISCOUNT = Target.the("").located(By.id("b_tt_holder_1"));
    public static final Target LTS_CHECK_IN = Target.the("").located(By.id("checkin_eta_hour"));
    public static final Target BTN_LATEST_DATA = Target.the("").located(By.name("book"));
    public static final Target BTN_COMPLETE_RESERVATION = Target.the("").located(By.name("book"));
    public static final Target BTN_CLOSED_ = Target.the("").located(By.xpath("//button[@class='bui-modal__close']"));
    public static final Target LBL_RESERVATION_CONFIRMED = Target.the("").located(By.xpath("//h1[@class='reassurance__title']"));
}
