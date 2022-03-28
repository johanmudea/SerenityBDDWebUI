package co.com.sofka.userinterface.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register extends PageObject {

    public static final Target SIGIN = Target
            .the("SignIn")
            .located(By.linkText("Sign in"));

    public static final Target EMAILR = Target
            .the("Email")
            .located(By.id("email_create"));

    public static final Target CREATEANACCOUNT = Target
            .the("CreateAnAccount")
            .located(By.id("SubmitCreate"));

    public static final Target FIRSTNAME = Target
            .the("FirstName")
            .located(By.id("customer_firstname"));

    public static final Target LASTNAME = Target
            .the("LastName")
            .located(By.id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("password")
            .located(By.id("password"));

    public static final Target ADDRESS = Target
            .the("address")
            .located(By.id("address1"));

    public static final Target CITY = Target
            .the("city")
            .located(By.id("city"));


    public static final Target STATE = Target
            .the("State")
            .located(By.id("id_state"));

    public static final Target ZIPCODE = Target
            .the("ZipCode")
            .located(By.id("postcode"));


    public static final Target COUNTRY = Target
            .the("Country")
            .located(By.id("id_country"));

    public static final Target PHONE = Target
            .the("Phone")
            .located(By.id("phone_module"));

    public static final Target REGISTERBUTTON = Target
            .the("Register")
            .located(By.cssSelector("#submitAccount > span"));




}
