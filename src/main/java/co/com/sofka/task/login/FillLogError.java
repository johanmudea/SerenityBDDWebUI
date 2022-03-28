package co.com.sofka.task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.login.Login.*;

public class FillLogError implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(EMAILLOGIN),
                Click.on(EMAILLOGIN),
                Enter.theValue("johanmm123@hotmail.com").into(EMAILLOGIN),

                Click.on(PASSWD),
                Enter.theValue("").into(PASSWD),


                Click.on(SUBMITLOGIN)
        );


    }

    public static FillLogError fillLogError(){
        return new FillLogError();
    }
}
