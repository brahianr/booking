package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.CarRentalModel;
import co.com.devco.certification.booking.questions.CarsForRent;
import co.com.devco.certification.booking.tasks.SearchCar;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarRentalStepDefinition {

    @When("^he enter the data to rent the car$")
    public void heEnterTheDataToRentTheCar(List<CarRentalModel> data) {
        theActorInTheSpotlight().attemptsTo(SearchCar.forRental(data.get(0)));
    }

    @Then("^he should see the available cars$")
    public void heShouldSeeTheAvailableCars() {
        theActorInTheSpotlight().should(seeThat(CarsForRent.areAvailable()));
    }

}
