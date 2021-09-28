package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LodgingSearchResultPage {

    public static final Target BTN_FAVORITE_FIRST_RESULT= Target.the("Favorite button first result").located(By.xpath("(//button[contains(@data-popover-content-id,'wl_entrypoint')])[1]"));
    public static final Target LBL_FIRST_RESULT= Target.the("First result label").located(By.xpath("(//button[contains(@data-popover-content-id,'wl_entrypoint')])[1]"));
    public static final Target BTN_LOWER_PRICE= Target.the("Lower price button").located(By.xpath("//li[@data-id='price']"));
    public static final Target IMG_FIRST_RESULT= Target.the("First result image").located(By.xpath("//img[@class='hotel_image']"));
    public static final Target IMG_LOADING_RESULT= Target.the("Loadging result image").located(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));

}
