package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AirportTaxisPage {

    public static final Target RDB_ROUND_TRIP= Target.the("Round trip radio button").located(By.xpath("//label[@class='rw-radio rw-return-radio__affirmative']"));
    public static final Target TXT_PICKUP_PLACE= Target.the("Pickup place field").located(By.id("pickupLocation"));
    public static final Target LBL_PICKUP_PLACE= Target.the("Pickup place label").located(By.xpath("//ul[@id='pickupLocation-items']/child::li[2]"));
    public static final Target TXT_DROPOFF_PLACE= Target.the("Dropoff place field").located(By.id("dropoffLocation"));
    public static final Target LBL_DROPOFF_PLACE= Target.the("Dropoff place label").located(By.xpath("//ul[@id='dropoffLocation-items']/child::li[2]"));
    public static final Target CLD_CALENDAR_AIRPORT_TAXI= Target.the("Airport taxi calendar").located(By.xpath("//button[@aria-label='pickup date input field']"));
    public static final Target CLD_PICKUP_DATE= Target.the("Pickup date calendar").locatedBy("//a[@aria-label='{0}']");
    public static final Target BTN_PICKUP_TIME= Target.the("Pickup time button").located(By.xpath("//button[@aria-label='pickup time input field']"));
    public static final Target LTS_PICKUP_HOUR= Target.the("Pickup hour list").located(By.xpath("//select[@id='pickupHour']"));
    public static final Target BTN_PICKUP_HOUR= Target.the("Pickup hour button").located(By.xpath("//button[@data-test='rw-time-picker__confirm-button']"));
    public static final Target LTS_PASSENGERS= Target.the("Passengers list").located(By.xpath("//select[@id='passengers']"));
    public static final Target BTN_SEARCH_TAXI= Target.the("Search taxi button").located(By.name("searchButton"));
}
