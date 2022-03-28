package co.com.sofka.question.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.practiceform.ContactUs.MESSAGE_SUCCESSFULLY;
import static co.com.sofka.userinterface.register.Register.INFOACCOUNT;

public class Register implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        return (INFOACCOUNT .resolveFor(actor).containsOnlyText("Welcome to your account. Here you can manage all of your personal information and orders.")

        );

    }
    public static Register register(){
        return new Register();
    }


}

