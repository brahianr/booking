package co.com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BTN_LOGIN= Target.the("Login button").located(By.xpath("//span[contains(.,'Inicia sesión')]"));
    public static final Target BTN_NOTIFICATIONS=Target.the("Notifications button").located(By.xpath("//button[@data-text='Ver tus notificaciones']"));
    public static final Target BTN_AIRPORT_TAXI=Target.the("Airport taxi button").located(By.xpath("//a[@data-decider-header='rideways']"));
    public static final Target BTN_PROFILE_MENU=Target.the("Profile menu button").located(By.id("profile-menu-trigger--content"));
    public static final Target BTN_MANAGE_ACCOUNT=Target.the("Manage account button").located(By.xpath("//span[@id='profile-menu-trigger--content']//following::ul//li"));
    public static final Target BTN_FAVOTIRES=Target.the("Favorites button").located(By.xpath("//span[contains(.,'Favori')]"));
}
