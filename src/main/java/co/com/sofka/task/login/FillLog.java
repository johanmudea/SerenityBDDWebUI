package co.com.sofka.task.login;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.sofka.userinterface.login.Login.*;


public class FillLog implements Task {

    private String emailLogin;
    private String password;

    public FillLog usingEmailLogin(String usedeMail) {
        this.emailLogin = emailLogin;
        return this;
    }

    public FillLog usingPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(SIGNOUT),
                Click.on(SIGNOUT),

                Scroll.to(EMAILLOGIN),
                Click.on(EMAILLOGIN),
                Enter.theValue("johanmm123@hotmail.com").into(EMAILLOGIN),

                Click.on(PASSWD),
                Enter.theValue(password).into(PASSWD),


                Click.on(SUBMITLOGIN)
        );


     }

    public static FillLog fillLog(){
        return new FillLog();
    }


}
