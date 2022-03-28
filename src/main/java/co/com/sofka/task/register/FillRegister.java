package co.com.sofka.task.register;



import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;



import static co.com.sofka.userinterface.register.Register.*;


public class FillRegister implements Task {

    private String Sign_in;
    private String Email;
    private String CreateAnAccount;
    private String FirstName;
    private String LastName;
    private String password;
    private String address;
    private String city;
    private String State;
    private String ZipCode;
    private String email;
    private String Country;
    private String Phone;
    private String Register;

    public FillRegister usingSign_in(String sign_in) {
        Sign_in = sign_in;
        return this;
    }

    public FillRegister usingEmail(String email) {
        Email = email;
        return this;

    }

    public FillRegister usingCountry(String country) {
        Country = country;
        return this;
    }

    public FillRegister usingPhone(String phone) {
        Phone = phone;
        return this;
    }

    public FillRegister usingRegister(String register) {
        Register = register;
        return this;
    }

    public FillRegister usingCreateAnAccount(String createAnAccount) {
        CreateAnAccount = createAnAccount;
        return this;
    }

    public FillRegister usingFirstName(String firstName) {
        FirstName = firstName;
        return this;
    }

    public FillRegister usingLastName(String lastName) {
        LastName = lastName;
        return this;
    }

    public FillRegister usingPassword(String password) {
        this.password = password;
        return this;
    }

    public FillRegister usingAddress(String address) {
        this.address = address;
        return this;
    }

    public FillRegister usingCity(String city) {
        this.city = city;
        return this;
    }

    public FillRegister usingState(String state) {
        State = state;
        return this;
    }

    public FillRegister usingZipCode(String zipCode) {
        ZipCode = zipCode;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

             /*   Scroll.to(SIGIN),
                Enter.theValue(Sign_in).into(SIGIN),

                Scroll.to(EMAILR),
                Enter.theValue(Email).into(EMAILR),

                Scroll.to(CREATEANACCOUNT),
                Enter.theValue(CreateAnAccount).into(CREATEANACCOUNT),*/

                Scroll.to(FIRSTNAME),
                Enter.theValue(FirstName).into(FIRSTNAME),

                Scroll.to(LASTNAME),
                Enter.theValue(LastName).into(LASTNAME),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(ADDRESS),
                Enter.theValue(address).into(ADDRESS),

                Scroll.to(CITY),
                Enter.theValue(city).into(CITY),


                Scroll.to(STATE),
                Click.on(STATE),
                SelectFromOptions.byVisibleText("Alaska").from(STATE),

                Scroll.to(ZIPCODE),
                Enter.theValue(ZipCode).into(ZIPCODE),

                Scroll.to(COUNTRY),
                Click.on(COUNTRY),
                SelectFromOptions.byVisibleText("United States").from(COUNTRY),

                Scroll.to(PHONE),
                Enter.theValue(Phone).into(PHONE),


                Scroll.to(REGISTERBUTTON),
                Click.on(REGISTERBUTTON)

        );

    }


    public static FillRegister fillRegister(){
        return new FillRegister();
    }


}