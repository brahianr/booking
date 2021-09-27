package co.com.devco.certification.booking.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentlyEnabled;
import net.serenitybdd.screenplay.targets.Target;

public class CheckItem implements Question<Boolean> {

    private Target element;

    public CheckItem(Target element) {
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentlyEnabled.of(element).viewedBy(actor).asBoolean();
        //return element.resolveFor(actor).isEnabled();
    }

    public static CheckItem isEnable(Target element){
        //return element.resolveFor(actor).isDisabled();
        return new CheckItem(element);
    }
}
