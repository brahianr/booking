package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.FlightModel;
import co.com.devco.certification.booking.tasks.SearchFlight;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchFlightStepDefinition {

    @When("^he enters the flight data$")
    public void heEntersTheFlightData(List<FlightModel> data) {
        //theActorInTheSpotlight().attemptsTo(SearchFlight.onPage(data.get(0)));
    }

    @Then("^he should see the available flights$")
    public void heShouldSeeTheAvailableFlights() {
    }
}
