package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certification.booking.exceptions.AddCompanionNotCompletedException;
import co.com.devco.certification.booking.models.TravelCompanionModel;
import co.com.devco.certification.booking.questions.CompanionData;
import co.com.devco.certification.booking.tasks.EnterHis;
import co.com.devco.certification.booking.tasks.GoToOption;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.devco.certification.booking.exceptions.AddCompanionNotCompletedException.ADD_COMPANION_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddTravelCompanionStepDefinition {

    @Given("^that user is in travel companion option$")
    public void thatUserIsInTravelCompanionOption() {
        theActorInTheSpotlight().wasAbleTo(
                GoToOption.addTravelCompanion()
        );
    }


    @When("^he enters the data of his companion$")
    public void heEntersTheDataOfHisCompanion(List<TravelCompanionModel> data) {
        theActorInTheSpotlight().attemptsTo(
                EnterHis.companionData(data.get(0))
        );
    }

    @Then("^he should see (.*) added$")
    public void heShouldSeeAdded(String name) {
       theActorInTheSpotlight().should(seeThat(CompanionData.added(name)).orComplainWith(AddCompanionNotCompletedException.class,ADD_COMPANION_FAILED_MESSAGE));
    }

}
