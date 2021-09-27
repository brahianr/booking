package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationPage {
    public static final Target BTN_RESERVE_NOW = Target.the("").located(By.xpath("//button[@id='hp_book_now_button']"));
    public static final Target LTS_BED_NUMBER = Target.the("").located(By.xpath("(//select[contains(@id,'hprt_nos_select')])[1]"));
    public static final Target BTN_RESERVE = Target.the("").located(By.xpath("//div[@class='hprt-reservation-cta']//button"));
    public static final Target BTN_LATEST_DATA = Target.the("").located(By.xpath("//button[@name='book']"));
    public static final Target BTN_COMPLETE_RESERVATION = Target.the("").located(By.xpath("//button[@name='book']"));
    public static final Target LBL_CONFIRMED_RESERVATION = Target.the("").located(By.xpath("//h1[contains(.,'está confirmada')]"));
}
