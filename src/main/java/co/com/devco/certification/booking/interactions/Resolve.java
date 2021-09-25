package co.com.devco.certification.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static co.com.devco.certification.booking.userinterfaces.SignInPage.BTN_CAPTCHA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Resolve implements Interaction {

    public static final IFrame  frame= IFrame.withPath(By.xpath("(//div[@id='px-captcha']//iframe)[3]"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(3);
        actor.attemptsTo(
                //WaitUntil.the(frame, isVisible()).forNoMoreThan(10).seconds(),
                //Switch.toFrame(frame),
                WaitUntil.the(BTN_CAPTCHA, isVisible()).forNoMoreThan(10).seconds(),
                /*MoveMouse.to(BTN_CAPTCHA).andThen(Actions::doubleClick),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::doubleClick),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::doubleClick),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::doubleClick),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::doubleClick),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::doubleClick)*/
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::clickAndHold),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::clickAndHold),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::clickAndHold),
                MoveMouse.to(BTN_CAPTCHA).andThen(Actions::clickAndHold)
        );

    }

    public static Resolve captcha(){
        return instrumented(Resolve.class);
    }
}
