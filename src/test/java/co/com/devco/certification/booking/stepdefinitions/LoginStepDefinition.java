package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.LogInNotCompletedException;
import co.com.devco.certification.booking.interactions.OpenBrowser;
import co.com.devco.certification.booking.models.UserModel;
import co.com.devco.certification.booking.questions.LogInResult;
import co.com.devco.certification.booking.tasks.LogIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.devco.certification.booking.exceptions.LogInNotCompletedException.LOGIN_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) open Booking home page$")
    public void thatUserOpenBookingHomePage(String user) {
        theActorCalled(user).wasAbleTo(OpenBrowser.onUrl());
    }

    @When("^he submit username and password$")
    public void heSubmitUsernameAndPassword(List<UserModel> data) {
        theActorInTheSpotlight().attemptsTo(LogIn.withData(data.get(0)));
    }

    @Then("^he should be logged in$")
    public void heShouldBeLoggedIn() {
        theActorInTheSpotlight().should(seeThat(LogInResult.successful()).orComplainWith(LogInNotCompletedException.class, LOGIN_FAILED_MESSAGE));
    }
}
