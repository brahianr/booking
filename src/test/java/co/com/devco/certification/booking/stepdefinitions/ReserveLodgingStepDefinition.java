package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.questions.Reservation;
import co.com.devco.certification.booking.tasks.ChooseThe;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReserveLodgingStepDefinition {

    @When("^he choose the lowest priced hotel$")
    public void heChooseTheLowestPricedHotel() {
        theActorInTheSpotlight().attemptsTo(
                ChooseThe.lowestPricedHotel()
        );
    }

    @Then("^he should see the message reservation confirmed$")
    public void heShouldSeeTheMessageReservationConfirmed() {
        theActorInTheSpotlight().should(seeThat(Reservation.isConfirmed()));
    }
}
