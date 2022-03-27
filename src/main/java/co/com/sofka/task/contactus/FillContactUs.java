package co.com.sofka.task.contactus;

import co.com.sofka.util.Subject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.sofka.userinterface.practiceform.ContactUs.*;
import static co.com.sofka.util.Subject.CUSTOMER_SERVICE;
import static co.com.sofka.util.Subject.WEBMASTER;

public class FillContactUs implements Task {

    private String subject;
    private String email;
    private String message;

    public FillContactUs choosingSubject() {
        this.subject = subject;
        return this;
    }

    public FillContactUs usingEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContactUs AndWithTheMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(MESSAGE),
                Enter.theValue(message).into(MESSAGE),

                Scroll.to(EMAIL),
                Click.on(SUBJECT),
                SelectFromOptions.byVisibleText("Webmaster").from(SUBJECT),


                Scroll.to(SUBMIT),
                Click.on(SUBMIT)

                );

    }

    public static FillContactUs fillContactUs(){
        return new FillContactUs();
    }



}
