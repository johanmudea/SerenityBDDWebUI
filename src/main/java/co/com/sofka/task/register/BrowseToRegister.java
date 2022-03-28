package co.com.sofka.task.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.register.Register.*;


public class BrowseToRegister implements Task {

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Scroll.to(SIGIN),
                    Click.on(SIGIN),

                    Scroll.to(EMAILR),
                    Click.on(EMAILR)



            );
        }
    public static BrowseToRegister browseToregister(){
        return new BrowseToRegister();
    }

    }