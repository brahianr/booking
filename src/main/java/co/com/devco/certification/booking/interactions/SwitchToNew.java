package co.com.devco.certification.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SwitchToNew implements Interaction {

   @Override
    public <T extends Actor> void performAs(T actor) {
       String currentWindow = getDriver().getWindowHandle();
       Set<String> allWindows = getDriver().getWindowHandles();
       for (String window : allWindows) {
           if (!window.contentEquals(currentWindow)) {
               getDriver().switchTo().window(window);
               break;
           }

       }
   }

    public static SwitchToNew newTab(){
        return instrumented(SwitchToNew.class);
    }
}
