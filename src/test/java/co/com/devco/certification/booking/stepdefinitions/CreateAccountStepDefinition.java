package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.interactions.OpenBrowser;
import co.com.devco.certification.booking.models.UserModel;
import co.com.devco.certification.booking.questions.Register;
import co.com.devco.certification.booking.tasks.CreateAccount;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateAccountStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that a web user wants to register on booking$")
    public void thatAWebUserWantsToRegisterOnBooking() {
        theActorCalled("Brahian").wasAbleTo(OpenBrowser.onUrl());
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields(List<UserModel> data) {
        theActorInTheSpotlight().attemptsTo(
                CreateAccount.withData(data.get(0))
        );
    }

    @Then("^he should see the welcome message$")
    public void heShouldSeeTheWelcomeMessage() {
        theActorInTheSpotlight().should(seeThat(Register.isSuccessful()));
    }


}
