package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;

public class CancelingSteps {

	
	HotelManager hotel = new HotelManager();
	

	@Given("^person (\\d+) has a booking $")
	public void person_A_has_a_booking(int personId) {
		hotel.addRoom();
		hotel.getAddedRoom().setBooked(personId);
	}

	@When("^he cancels his booking$")
	public void he_cancels_his_booking() {
		hotel.getAddedRoom().setFree();
		
	}

	@Then("^the room becomes free$")
	public void the_room_becomes_free(Room room) {
		
		assertTrue(room.isFree());
	}


}
