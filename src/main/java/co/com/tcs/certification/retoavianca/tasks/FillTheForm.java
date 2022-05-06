package co.com.tcs.certification.retoavianca.tasks;


import co.com.tcs.certification.retoavianca.models.UserModel;
import co.com.tcs.certification.retoavianca.userinterfaces.FormUI;
import co.com.tcs.certification.retoavianca.utils.Metodos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

public class FillTheForm implements Task {
   /* private String name;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String username;
    private String password;

    public FillTheForm(List<UserModel> list) {
        this.name = list.get(0).getName();
        this.phone = list.get(0).getPhone();
        this.email = list.get(0).getEmail();
        this.country = list.get(0).getCountry();
        this.city = list.get(0).getCity();
        this.username = list.get(0).getUsername();
        this.password = list.get(0).getPassword();
    }*/


    @Override
    public<T extends Actor> void performAs(T actor){

        WaitUntil.the(FormUI.NAME, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds();

        System.out.println("Entro al task");

        Metodos persona = new Metodos();
        System.out.println(persona.datos());
        actor.attemptsTo(Enter.theValue("Luisa Fernanda Ramirez Beltran").into(FormUI.NAME),
                Enter.theValue("32165987").into(FormUI.PHONE),
                Enter.theValue("luisa@ramirez.com").into(FormUI.EMAIL),
                Click.on(FormUI.COUNTRY),
                Enter.theValue("Cali").into(FormUI.CITY),
                Enter.theValue("lfrb").into(FormUI.USERNAME),
                Enter.theValue("123Abc").into(FormUI.PASSWORD),
                Click.on(FormUI.SUBMIT));

    }

   public static FillTheForm fillTheForm(){
        return Tasks.instrumented(FillTheForm.class);
   }
}
