package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.HotelReservationModel;
import co.com.devco.certification.booking.questions.ViewTheItem;
import co.com.devco.certification.booking.tasks.AddLodging;
import co.com.devco.certification.booking.tasks.SearchLodging;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddFavoriteLodgingStepDefinition {

    @When("^he enters the reservation data$")
    public void heEntersTheReservationData(List<HotelReservationModel> data) {
        theActorInTheSpotlight().attemptsTo(SearchLodging.onPage(data.get(0)));
    }

    @And("^he add hotel to favorites$")
    public void heAddHotelToFavorites() {
        theActorInTheSpotlight().attemptsTo(
                AddLodging.toFavorites()
        );
    }

    @Then("^he should see the hotel in favorites$")
    public void heShouldSeeTheHotelInFavorites() {
        theActorInTheSpotlight().should(seeThat(ViewTheItem.inFavorites()));
    }

}
