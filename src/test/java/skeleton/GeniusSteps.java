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

public class GeniusSteps {

	Hotel hotel = HotelProvider.getExampleHotel();
	HotelManager hotelManager = HotelProvider.getExampleHotelManager(hotel);
	Room lockingRoom;
	Customer customer = HotelProvider.getCustomerFromList(0);
	Customer regularCustomer = HotelProvider.getCustomerFromList(2);

	@Given("^there is a room locked by a non-genius customer$")
	public void there_is_a_room_locked_by_a_non_genius_customer() {
		lockingRoom = hotelManager.getFreeRoom();
		hotelManager.startBooking(customer, lockingRoom);
	}

	@When("^a genius customer makes a booking for this room$")
	public void a_genius_customer_makes_a_booking_for_this_room() {
		hotelManager.startBooking(regularCustomer, lockingRoom);
	}

	@Then("^the old customer cannot complete the booking$")
	public void the_old_customer_cannot_complete_the_booking() {
		assertFalse(hotelManager.isCompleteBookingPossible(customer, lockingRoom));
	}

	@Then("^the room is locked$")
	public void the_room_is_locked() {
		assertTrue(lockingRoom.isLocked());
	}

	@When("^a genius user lists available rooms$")
	public void a_genius_user_lists_available_rooms() {
		regularCustomer.setRegular(true);
		hotelManager.displayAvailableRooms(regularCustomer);
	}

	@Then("^this room is on that list$")
	public void this_room_is_on_that_list() {
		assertTrue(hotel.roomList.contains(lockingRoom));
	}

}
