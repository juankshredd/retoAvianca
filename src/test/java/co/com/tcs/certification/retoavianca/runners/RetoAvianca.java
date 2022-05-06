package co.com.tcs.certification.retoavianca.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/reto_avianca.feature",
        glue = "co.com.tcs.certification.retoavianca.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = ""
)
public class RetoAvianca {
}