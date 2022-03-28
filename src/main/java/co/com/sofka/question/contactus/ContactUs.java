package co.com.sofka.question.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.contactus.ContactUs.MESSAGE_SUCCESSFULLY;


public class ContactUs implements Question<Boolean> {

    private String subject;
    private String email;
    private String message;

    public ContactUs wasFillingSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public ContactUs wasFillingEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactUs wasFillingMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

            return (MESSAGE_SUCCESSFULLY .resolveFor(actor).containsOnlyText("Your message has been successfully sent to our team.")

            );

    }
    public static ContactUs contactUs(){
        return new ContactUs();
    }


}

