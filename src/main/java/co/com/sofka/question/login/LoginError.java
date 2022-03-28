package co.com.sofka.question.login;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.sofka.userinterface.login.Login.PASSWDERROR;

public class LoginError implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        return (PASSWDERROR .resolveFor(actor).containsOnlyText("Password is required.")

        );

    }

    public static LoginError loginError(){
        return new LoginError();
    }


}

