package co.com.tcs.certification.retoavianca.tasks;



import co.com.tcs.certification.retoavianca.userinterfaces.FormUI;
import co.com.tcs.certification.retoavianca.utils.Metodos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;




public class FillTheForm implements Task {



    @Override
    public<T extends Actor> void performAs(T actor){

        WaitUntil.the(FormUI.NAME, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds();
        Metodos persona = new Metodos();
        System.out.println(persona.datos());
        actor.attemptsTo(Enter.theValue(persona.datos()).into(FormUI.NAME),
                Enter.theValue(persona.phone()).into(FormUI.PHONE),
                Enter.theValue(persona.email()).into(FormUI.EMAIL),
                Enter.theValue("Cali").into(FormUI.CITY),
                Enter.theValue(persona.userName()).into(FormUI.USERNAME),
                Enter.theValue("123Abc").into(FormUI.PASSWORD),
                Click.on(FormUI.SUBMIT));

    }

   public static FillTheForm fillTheForm(){
        return Tasks.instrumented(FillTheForm.class);
   }
}
