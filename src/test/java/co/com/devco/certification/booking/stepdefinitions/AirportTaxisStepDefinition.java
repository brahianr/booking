package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.SearchTaxisNotCompletedException;
import co.com.devco.certification.booking.models.AirportTaxisModel;
import co.com.devco.certification.booking.questions.AirportTaxiSearchResult;
import co.com.devco.certification.booking.tasks.SearchTaxi;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.devco.certification.booking.exceptions.SearchTaxisNotCompletedException.SEARCH_TAXIS_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AirportTaxisStepDefinition {

    @When("^he enters the taxi rental data$")
    public void heEntersTheTaxiRentalData(List<AirportTaxisModel> data) {
        theActorInTheSpotlight().attemptsTo(SearchTaxi.forAirport(data.get(0)));
    }


    @Then("^he should see the available taxis$")
    public void heShouldSeeTheAvailableTaxis() {
        theActorInTheSpotlight().should(seeThat(AirportTaxiSearchResult.showAvailableOnes()).orComplainWith(SearchTaxisNotCompletedException.class,SEARCH_TAXIS_FAILED_MESSAGE));
    }
}
