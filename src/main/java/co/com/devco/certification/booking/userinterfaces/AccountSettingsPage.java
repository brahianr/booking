package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountSettingsPage {

    public static final Target BTN_EMAIL_NOTIFICATION= Target.the("Email notification button").located(By.xpath("//li[@data-ga-label='Category: notifications']"));
    public static final Target BTN_MANAGE_EMAIL_NOTIFICATION= Target.the("Manage email notification button").located(By.xpath("//a[@data-ga-label='Edit redirect: email_preferences']"));
    public static final Target BTN_TRAVEL_COMPANION= Target.the("Travel companion button").located(By.xpath("//li[@data-ga-label='Category: other_travellers']"));

}
