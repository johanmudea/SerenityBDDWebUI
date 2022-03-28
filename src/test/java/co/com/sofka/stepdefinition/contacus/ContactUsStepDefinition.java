package co.com.sofka.stepdefinition.contacus;

import co.com.sofka.stepdefinition.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static co.com.sofka.question.contactus.ContactUs.contactUs;
import static co.com.sofka.question.contactus.ContactUsFailed.contactUsFailed;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.contactus.BrowseToContactUs.browseToContactUs;
import static co.com.sofka.task.contactus.FillContactUs.fillContactUs;

import static java.lang.Math.random;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;



public class ContactUsStepDefinition extends Setup {

    @Given("the user is on landing page of the automationpractice")
    public void theUserIsOnLandingPageOfTheAutomationpractice() {
        actorSetupTheBrowser("Johan");
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }

    @When("him browse to contact us link")
    public void himBrowseToContactUsLink() {
        theActorInTheSpotlight()
                .attemptsTo(browseToContactUs());

    }
    @When("him has filled it and submitted")
    public void himHasFilledItAndSubmitted() {

        theActorInTheSpotlight().attemptsTo(
                fillContactUs()
                        .usingEmail("johan"+random()+"@hotmail.com")
                        .choosingSubject()
                        .AndWithTheMessage("Esto es una prueba")

        );
        

    }
    @Then("the user will see a confirmation message.")
    public void theUserWillSeeAConfirmationMessage() {

        theActorInTheSpotlight().should(
                seeThat(contactUs(), Matchers.equalTo(true)));



    }



    //SEGUNDO SCENARIO

    @Given("the user is on landing page of automationpractice")
    public void theUserIsOnLandingPageOfAutomationpractice() {

        actorSetupTheBrowser("Johan");
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }


    @When("him browse to contact us")
    public void himBrowseToContactUs() {

        theActorInTheSpotlight()
                .attemptsTo(browseToContactUs());

    }
    @When("him has filled it without subject and submitted")
    public void himHasFilledItWithoutSubjectAndSubmitted() {

        theActorInTheSpotlight().attemptsTo(
                fillContactUs()
                        .usingEmail("")
                        .choosingSubject()
                        .AndWithTheMessage("Esto es una prueba")

        );

    }
    @Then("the user will see a subject error message.")
    public void theUserWillSeeASubjectErrorMessage() {

        theActorInTheSpotlight().should(
                seeThat(contactUsFailed(), Matchers.equalTo(true)));


    }

}
