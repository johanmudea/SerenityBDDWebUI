package co.com.sofka.stepdefinition.register;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import java.util.Map;

import static co.com.sofka.task.contactus.FillContactUs.fillContactUs;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.register.BrowseToRegister.browseToregister;
import static co.com.sofka.task.register.FillRegister.fillRegister;
import static co.com.sofka.userinterface.practiceform.ContactUs.SUBMIT;
import static java.lang.Math.random;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinition extends Setup {

    @Given("the user is on landing page of automationpractice")
    public void theUserIsOnLandingPageOfAutomationpractice() {

        actorSetupTheBrowser("Johan");
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }

    @When("him browse to register himself")
    public void himBrowseToRegisterHimself() {

        theActorInTheSpotlight()
                .attemptsTo(browseToregister());

    }
    @When("him has filled it and submitted")
    public void himHasFilledItAndSubmitted() {

        theActorInTheSpotlight().attemptsTo(
                fillRegister()


                        .usingFirstName("firstName")
                        .usingLastName("LastName")
                        .usingPassword("password")
                        .usingAddress("address")
                        .usingCity("city")
                        .usingState("state")
                        .usingZipCode("postalCode")
                        .usingCountry("country")
                        .usingPhone("phone")




        );



    }

    @Then("the user will see a confirmation message.")
    public void theUserWillSeeAConfirmationMessage() {

    }



    // segundo scenario

@Given("the user is on landing page of automationpractice web")
public void theUserIsOnLandingPageOfAutomationpracticeWeb() {

    }


@When("him browse to register")
public void himBrowseToRegister() {

    }
@When("him has filled it with postalCode  different of five digits and submitted")
public void himHasFilledItWithPostalCodeDifferentOfFiveDigitsAndSubmitted() {

    }
@Then("the user will see a postalCode error message.")
public void theUserWillSeeAPostalCodeErrorMessage() {

    }



}
