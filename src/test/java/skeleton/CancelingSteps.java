package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class CancelingSteps {

	
	HotelManager hotel = new HotelManager();
	

	@Given("^person A has a booking$")
	public void person_A_has_a_booking(Person bookingPerson) {
		hotel.addRoom();
		hotel.bookingAddedRoom(bookingPerson);
	}

	@When("^he cancels his booking$")
	public void he_cancels_his_booking(Person cancelingPerson, Booking booking) {
		hotel.cancelBooking(cancelingPerson, booking);
		
	}

	@Then("^the room becomes free$")
	public void the_room_becomes_free(Room room) {
		
		assertTrue(room.isFree());
	}


}
