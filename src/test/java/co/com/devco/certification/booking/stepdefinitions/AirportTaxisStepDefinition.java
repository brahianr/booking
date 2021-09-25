package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.AirportTaxisModel;
import co.com.devco.certification.booking.tasks.SearchTaxi;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AirportTaxisStepDefinition {

    @When("^he enters the taxi rental data$")
    public void heEntersTheTaxiRentalData(List<AirportTaxisModel> data) {
        theActorInTheSpotlight().attemptsTo(SearchTaxi.forAirport(data.get(0)));
    }


    @Then("^he should see the available taxis$")
    public void heShouldSeeTheAvailableTaxis() {
    }
}
