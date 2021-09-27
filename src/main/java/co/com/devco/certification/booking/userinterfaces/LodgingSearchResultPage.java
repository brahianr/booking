package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LodgingSearchResultPage {

    public static final Target LBL_LODGING_RESULT= Target.the("").located(By.xpath("//div[@class='sr_header ']"));
    public static final Target BTN_FAVORITE_FIRST_RESULT= Target.the("").located(By.xpath("(//button[contains(@data-popover-content-id,'wl_entrypoint')])[1]"));
    public static final Target LBL_FIRST_RESULT= Target.the("").located(By.xpath("(//button[contains(@data-popover-content-id,'wl_entrypoint')])[1]"));
    public static final Target BTN_LOWER_PRICE= Target.the("").located(By.xpath("//li[@data-id='price']"));
    public static final Target IMG_FIRST_RESULT= Target.the("").located(By.xpath("//img[@class='hotel_image']"));
    public static final Target IMG_LOADING_RESULT= Target.the("").located(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));

}
