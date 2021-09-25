package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AirportTaxisPage {

    public static final Target TXT_PICKUP_PLACE= Target.the("").located(By.id("pickupLocation"));
    public static final Target LBL_PICKUP_PLACE= Target.the("").located(By.xpath("//ul[@id='pickupLocation-items']/child::li[2]"));
    public static final Target TXT_DROPOFF_PLACE= Target.the("").located(By.id("dropoffLocation"));
    public static final Target LBL_DROPOFF_PLACE= Target.the("").located(By.xpath("//ul[@id='dropoffLocation-items']/child::li[2]"));
    public static final Target DP_CALENDAR_AIRPORT_TAXI= Target.the("").located(By.xpath("//button[@aria-label='pickup date input field']"));
    public static final Target DP_PICKUP_DATE= Target.the("").located(By.xpath("//a[@aria-label='30, Septiembre 2021']"));
    public static final Target BTN_PICKUP_TIME= Target.the("").located(By.xpath("//button[@aria-label='pickup time input field']"));
    public static final Target LTS_PICKUP_HOUR= Target.the("").located(By.xpath("//select[@id='pickupHour']"));
    public static final Target BTN_PICKUP_HOUR= Target.the("").located(By.xpath("//button[@data-test='rw-time-picker__confirm-button']"));
    public static final Target LTS_PASSENGERS= Target.the("").located(By.xpath("//select[@id='passengers']"));
    public static final Target BTN_SEARCH_TAXI= Target.the("").located(By.name("searchButton"));
}
