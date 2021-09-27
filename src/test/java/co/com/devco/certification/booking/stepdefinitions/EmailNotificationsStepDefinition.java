package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.questions.Email;
import co.com.devco.certification.booking.tasks.EnterTheNotification;
import co.com.devco.certification.booking.tasks.UnsubscribeEmail;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmailNotificationsStepDefinition {

    @Given("^that user is in email notifications for reservation option$")
    public void thatUserIsInEmailNotificationsForReservationOption() {
        theActorInTheSpotlight().wasAbleTo(
                EnterTheNotification.forReservations()
        );
    }

    @When("^unsubscribe from email notifications for reservations$")
    public void unsubscribeFromEmailNotificationsForReservations() {
        theActorInTheSpotlight().attemptsTo(
                UnsubscribeEmail.forReservation()
        );
    }

    @Then("^he should see the message you have unsubscribed$")
    public void heShouldSeeTheMessageYouHaveUnsubscribed() {
        theActorInTheSpotlight().should(seeThat(Email.wasUnsubscribed()));
    }
}
