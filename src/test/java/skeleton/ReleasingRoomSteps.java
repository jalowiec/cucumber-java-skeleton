package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pl.edu.agh.to.booking.hotelProvider.HotelProvider;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class ReleasingRoomSteps {

	Hotel hotel = HotelProvider.getExampleHotel();
	HotelManager hotelManager = HotelProvider.getExampleHotelManager(hotel);
	Room room;
	Customer customer = HotelProvider.getCustomerFromList(0);

	@Given("^a person started booking$")
	public void a_person_started_booking() {

		room = hotelManager.getFreeRoom();
		hotelManager.startBooking(customer, room);

	}

	@When("^(\\d+) minutes elapses and the booking is still not complete$")
	public void minutes_elapses_and_the_booking_is_still_not_complete(int arg1) {
		
		hotelManager.cancelBooking(customer, room);
		
		// TO DO
	}

	@Then("^the room becomes available again$")
	public void the_room_becomes_available_again() {
		assertTrue(room.isFree());
				
	}
	@Then("^person A cannot complete booking$")
	public void person_A_cannot_complete_booking() {
		assertFalse(hotelManager.isCompleteBookingPossible(customer, room));
	}

}
