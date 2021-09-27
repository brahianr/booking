package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountSettingsPage {

    public static final Target BTN_EMAIL_NOTIFICATION= Target.the("").located(By.xpath("//li[@data-ga-label='Category: notifications']"));
    public static final Target BTN_MANAGE_EMAIL_NOTIFICATION= Target.the("").located(By.xpath("//a[@data-ga-label='Edit redirect: email_preferences']"));
    public static final Target BTN_TRAVEL_COMPANION= Target.the("").located(By.xpath("//li[@data-ga-label='Category: other_travellers']"));


    public static final Target BTN_SECURITY= Target.the("").located(By.xpath("//li[@data-ga-label='Category: security']"));
    public static final Target BTN_DELETE_ACCOUNT= Target.the("").located(By.xpath("//button[contains(@data-ga-label,'Edit section: undefined')]"));
    public static final Target RDB_FIRST_OPTION_DELETE_ACCOUNT= Target.the("").located(By.xpath("//input[@name='deleteAction']//following::span"));
    public static final Target BTN_UNSUBSCRIBE= Target.the("").located(By.xpath("//button[contains(@data-ga-label,'Save section: undefined')]"));
}
