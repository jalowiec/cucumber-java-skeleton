package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class ReleasingRoomSteps {

	
	HotelManager hotel = new HotelManager();
	Room room;
	

	@Given("^a person started booking$")
	public void a_person_started_booking() {
		hotel.addRoom();
		room = hotel.getFreeRoom();
		hotel.lockingRoom(room);
		
	}

	@When("^(\\d+) minutes elapses and the booking is still not complete$")
	public void minutes_elapses_and_the_booking_is_still_not_complete(int arg1) {
	    hotel.cancelingLockedRooms(arg1); 
	}

	@Then("^the room becomes available again$")
	public void the_room_becomes_available_again() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^person A cannot complete booking$")
	public void person_A_cannot_complete_booking() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
