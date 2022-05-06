package co.com.tcs.certification.retoavianca.questions;

import co.com.tcs.certification.retoavianca.userinterfaces.FormUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static org.junit.Assert.assertEquals;

public class ValidateMsg implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return FormUI.ALERT.resolveFor(actor).getText();
    }

    public static ValidateMsg validateMsg(){
        return  new ValidateMsg();
    }
}
