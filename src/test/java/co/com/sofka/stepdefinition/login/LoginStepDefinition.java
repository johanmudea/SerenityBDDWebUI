package co.com.sofka.stepdefinition.login;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static co.com.sofka.question.register.Register.register;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.login.FillLog.fillLog;
import static co.com.sofka.task.login.FillPreLogin.fillPreLogin;
import static co.com.sofka.task.register.BrowseToRegister.browseToregister;

import static java.lang.Math.random;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition extends Setup {

    private String usedeMail;

    public static String usedMail(){
        return "johanmm123@hotmail.com";
    }





    @Given("the user is on landing page")
    public void theUserIsOnLandingPage() {

        actorSetupTheBrowser("Johan");
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }

    @When("him browse to login")
    public void himBrowseToLogin() {

        usedeMail = usedMail();

        theActorInTheSpotlight()
                .attemptsTo(browseToregister());

        theActorInTheSpotlight().attemptsTo(
                fillPreLogin()
                        .usingEmail(usedeMail)
                        .usingFirstName("firstName")
                        .usingLastName("LastName")
                        .usingPassword("password")
                        .usingAddress("address")
                        .usingCity("city")
                        .usingState("state")
                        .usingZipCode("05001")
                        .usingCountry("country")
                        .usingPhone("4122735411")

        );



    }
    @When("him has filled it and submitted")
    public void himHasFilledItAndSubmitted() {

        theActorInTheSpotlight().attemptsTo(
                fillLog()
                        .usingEmailLogin(usedeMail)
                        .usingPassword("password")

        );



    }
    @Then("the user will see a confirmation message.")
    public void theUserWillSeeAConfirmationMessage() {

        theActorInTheSpotlight().should(
                seeThat(register(), Matchers.equalTo(true)));

    }


    @Given("the user is on landing page of automationpractice")
    public void theUserIsOnLandingPageOfAutomationpractice() {

    }


    @When("him browse to log")
    public void himBrowseToLog() {

    }
    @When("him has filled it without password and submitted")
    public void himHasFilledItWithoutPasswordAndSubmitted() {

    }
    @Then("the user will see a password required error message.")
    public void theUserWillSeeAPasswordRequiredErrorMessage() {

    }







}
