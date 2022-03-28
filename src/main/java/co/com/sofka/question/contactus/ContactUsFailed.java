package co.com.sofka.question.contactus;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.contactus.ContactUs.MESSAGE_UNSUCCESSFULLY;


public class ContactUsFailed implements Question<Boolean> {

    private String subject;
    private String email;
    private String message;

    public ContactUsFailed wasFillingSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public ContactUsFailed wasFillingEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactUsFailed wasFillingMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return (MESSAGE_UNSUCCESSFULLY.resolveFor(actor).containsOnlyText("Invalid email address.")

        );

    }
    public static ContactUsFailed contactUsFailed(){
        return new ContactUsFailed();
    }


}
