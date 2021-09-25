package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.models.HotelReservationModel;
import co.com.devco.certification.booking.tasks.SearchLodging;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HotelReservationStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    /*@Given("^that the user is on the Booking page$")
    public void thatTheUserIsOnTheBookingPage() {
    }*/

    @When("^he enters the reservation data$")
    public void heEntersTheReservationData(List<HotelReservationModel> data) {
        theActorInTheSpotlight().attemptsTo(SearchLodging.onPage(data.get(0)));
    }

    @Then("^he should see the confirmed reservation message$")
    public void heShouldSeeTheConfirmedReservationMessage() {
    }


}
