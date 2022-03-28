package co.com.sofka.question.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.sofka.userinterface.register.Register.ERRORZIP;
import static co.com.sofka.userinterface.register.Register.INFOACCOUNT;

public class RegisterZipError implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        return (ERRORZIP .resolveFor(actor).containsOnlyText("The Zip/Postal code you've entered is invalid. It must follow this format: 00000")

        );

    }


    public static RegisterZipError registerZipError(){
        return new RegisterZipError();
    }


}

