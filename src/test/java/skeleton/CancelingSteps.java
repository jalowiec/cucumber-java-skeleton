package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class CancelingSteps {

	
	HotelManager hotel = new HotelManager();
	Person person = new Person(1, "Jan", "Kowalski");
	int bookingId = 100;
	Room room;
	Booking booking;
	
	@Given("^person A has a booking$")
	public void person_A_has_a_booking() {
		hotel.addRoom();
		room = hotel.getFreeRoom();
		hotel.bookingRoom(bookingId, person, room);
			
	}

	@When("^he cancels his booking$")
	public void he_cancels_his_booking() {
	    hotel.cancelBooking(bookingId);
	}

	@Then("^the room becomes free$")
	public void the_room_becomes_free() {
		assertTrue(room.isFree());
	}


}
