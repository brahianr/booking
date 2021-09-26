package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarRentalPage {

    public static final Target RDB_RETURN_ANOTHER_PLACE = Target.the("").located(By.xpath("//label[@for='return-location-different']"));
    public static final Target RDB_RETURN_ANOTHER_PLACE2 = Target.the("").located(By.xpath("//label[@for='return-location-same']"));
    public static final Target TXT_PICKUP_PLACE_CAR= Target.the("").located(By.id("ss_origin"));
    public static final Target LTS_FIRST_RESULT_PICKUP_CAR= Target.the("").located(By.xpath("//input[@id='ss_origin']//following::ul//li"));
    public static final Target TXT_DROPOFF_PLACE_CAR= Target.the("").located(By.id("ss"));
    public static final Target LTS_FIRST_RESULT_DROPOFF_CAR= Target.the("").located(By.xpath("//input[@id='ss']//following::ul//li"));
    public static final Target CLD_CALENDAR_CAR_RENTAL= Target.the("").located(By.xpath("//div[@data-mode='checkin']"));
    public static final Target CLD_CALENDAR_CAR_RENTAL2= Target.the("").located(By.xpath("//div[@data-mode='checkout']"));
    public static final Target CLD_DEPARTURE_DATE_CAR_RENTAL= Target.the("").locatedBy("//th[contains(.,'{0}')]//following::span[contains(.,'{1}')]");
    public static final Target CLD_ARRIVAL_DATE_CAR_RENTAL= Target.the("").locatedBy("//div[@data-mode='checkout']//following::th[contains(.,'{0}')]//following::span[contains(.,'{1}')]");
    public static final Target BTN_SEARCH_CAR_RENTAL= Target.the("").located(By.xpath("//button[@data-sb-id='main']"));
    public static final Target LBL_SCROLL= Target.the("").located(By.xpath("//h2[contains(.,'Destinos ')]"));
}
