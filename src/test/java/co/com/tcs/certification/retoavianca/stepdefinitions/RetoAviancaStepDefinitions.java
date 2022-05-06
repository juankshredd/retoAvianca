package co.com.tcs.certification.retoavianca.stepdefinitions;


import co.com.tcs.certification.retoavianca.models.UserModel;
import co.com.tcs.certification.retoavianca.questions.ValidateMsg;
import co.com.tcs.certification.retoavianca.tasks.FillTheForm;
import co.com.tcs.certification.retoavianca.utils.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class RetoAviancaStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverWeb.hisBrowser())));
        OnStage.theActorCalled("user");
    }


    @Given("^I am in the main page$")
    public void iAmInTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.way2automation.com/way2auto_jquery/index.php"));
    }

    @When("^I fill the form and submit$")
    public void iFillTheFormAndSubmit(List<UserModel> userModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillTheForm.fillTheForm());
    }

    @Then("^I should watch the massage (.*)$")
    public void iShouldWatchTheMassage(String msg) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMsg.validateMsg(), Matchers.equalTo(msg)));
    }
}
