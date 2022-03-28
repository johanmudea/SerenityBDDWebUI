package co.com.sofka.userinterface.practiceform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class ContactUs extends PageObject {

    public static final Target CONTACTUS = Target
            .the("Contact us")
            .located(By.id("contact-link"));

    public static final Target SUBJECT = Target
            .the("subject")
            .located(id("id_contact"));

    public static final Target EMAIL = Target
            .the("email")
            .located(id("email"));

    public static final Target MESSAGE = Target
            .the("message")
            .located(id("message"));

    public static final Target SUBMIT = Target
            .the("submit")
            .located(id("submitMessage"));

    public static final Target MESSAGE_SUCCESSFULLY = Target
            .the("message_successfully")
            .located(cssSelector(".alert"));

    public static final Target MESSAGE_UNSUCCESSFULLY = Target
            .the("message_unsuccessfully")
            .located(cssSelector("ol > li"));



}
