package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LockingRoomSteps {

	
	HotelManager hotel = new HotelManager();
	
	@When("^a person begins to book that room$")
	public void a_person_begins_to_book_that_room() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the room becomes unavailable$")
	public void the_room_becomes_unavailable() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
}
