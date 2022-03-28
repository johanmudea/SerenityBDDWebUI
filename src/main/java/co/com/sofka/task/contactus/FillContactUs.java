package co.com.sofka.task.contactus;


import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static co.com.sofka.userinterface.contactus.ContactUs.*;



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

                Scroll.to(SUBJECT),
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
