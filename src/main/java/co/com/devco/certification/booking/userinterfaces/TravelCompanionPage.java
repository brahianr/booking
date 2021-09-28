package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TravelCompanionPage {

    public static final Target BTN_ADD_COMPANION= Target.the("Button to add travel companion").located(By.xpath("//button[@data-ga-label='Edit section: new_traveller']"));
    public static final Target TXT_NAME= Target.the("Name field").located(By.name("first"));
    public static final Target TXT_LASTNAME= Target.the("Lastname field").located(By.name("last"));
    public static final Target TXT_BIRTH_DAY= Target.the("Birth day field").located(By.name("day"));
    public static final Target TXT_BIRTH_MONTH= Target.the("Birth month field").located(By.name("month"));
    public static final Target TXT_BIRTH_YEAR= Target.the("Birth year field").located(By.name("year"));
    public static final Target BTN_SAVE= Target.the("Save Button").located(By.xpath("//button[@data-ga-label='Save section: new_traveller']"));
    public static final Target LBL_COMPANION_NAME= Target.the("Companion name label").locatedBy("//h3[contains(.,'{0}')]");
}
