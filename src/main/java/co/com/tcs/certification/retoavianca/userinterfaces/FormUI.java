package co.com.tcs.certification.retoavianca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormUI {
    public static final Target NAME = Target.the("name")
            .located(By.name("name"));
    public static final Target PHONE = Target.the("phone")
            .located(By.name("phone"));
    public static final Target EMAIL = Target.the("email")
            .located(By.name("email"));
    public static final Target CITY = Target.the("city")
            .located(By.name("city"));
    public static final Target USERNAME = Target.the("username")
            .located(By.xpath("(//*[@name=\"username\"])[2]"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.xpath("(//*[@name=\"password\"])[2]"));
    public static final Target SUBMIT = Target.the("name")
            .located(By.xpath("(//input[@class=\"button\"])[2]"));
    public static final Target ALERT = Target.the("alert")
            .located(By.id("alert"));
}

