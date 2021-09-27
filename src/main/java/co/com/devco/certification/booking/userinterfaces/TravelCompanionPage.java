package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TravelCompanionPage {

    public static final Target BTN_ADD_COMPANION= Target.the("").located(By.xpath("//button[@data-ga-label='Edit section: new_traveller']"));
    public static final Target TXT_NAME= Target.the("").located(By.name("first"));
    public static final Target TXT_LASTNAME= Target.the("").located(By.name("last"));
    public static final Target TXT_BIRTH_DAY= Target.the("").located(By.name("day"));
    public static final Target TXT_BIRTH_MONTH= Target.the("").located(By.name("month"));
    public static final Target TXT_BIRTH_YEAR= Target.the("").located(By.name("year"));
    public static final Target BTN_SAVE= Target.the("").located(By.xpath("//button[@data-ga-label='Save section: new_traveller']"));
    public static final Target LBL_COMPANION_NAME= Target.the("").locatedBy("//h3[contains(.,'{0}')]");
}
