package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TouristAttractionPage {

    public static final Target TXT_ATTRACTION_SEARCH = Target.the("").located(By.name("query"));
    public static final Target LBL_FISRT_RESULT_ATTRACTION = Target.the("").located(By.xpath("//a[@data-testid='search-bar-result']"));
    public static final Target BTN_ATTRACTION_SEARCH = Target.the("").located(By.xpath("//span[contains(.,'Buscar')]"));


}
