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

public class BookingSteps {

	HotelManager hotelManager = HotelProvider.getExampleHotelManager();
	Hotel hotel = HotelProvider.getExampleHotel();

	Room bookingRoom;
	Customer bookingCustomer = HotelProvider.getExampleCustomer();
	Booking booking;

	@Given("^there is a free room$")
	public void there_is_a_free_room() {
		bookingRoom = hotelManager.getFreeRoom(hotel);
	}

	@When("^person A books it$")
	public void person_A_books_it() {
		booking = hotelManager.bookingRoom(bookingCustomer, bookingRoom, hotel);
	}

	@Then("^it is booked by person A$")
	public void it_is_booked_by_person_A() {
		assertEquals(bookingCustomer, booking.getBookingCustomer());
	}

	@Then("^it can no longer be booked$")
	public void it_can_no_longer_be_booked() {
		assertFalse(bookingRoom.isFree());
	}
	
	@When("^a person begins to book that room$")
	public void a_person_begins_to_book_that_room() {
		hotelManager.lockingRoom(bookingCustomer, bookingRoom, hotel);
	}

	@Then("^the room becomes unavailable$")
	public void the_room_becomes_unavailable() {
	    
		assertFalse(bookingRoom.isFree());
	
	    
	}
	

	@Given("^person A has a booking$")
	public void person_A_has_a_booking() {
		bookingRoom = hotelManager.getFreeRoom(hotel);
		booking = hotelManager.bookingRoom(bookingCustomer, bookingRoom, hotel);
		bookingRoom = hotelManager.getFreeRoom(hotel);
		booking = hotelManager.bookingRoom(bookingCustomer, bookingRoom, hotel);
	}

	@When("^he cancels his booking$")
	public void he_cancels_his_booking() {
		hotelManager.cancelBooking(booking, hotel);
	}

	@Then("^the room becomes free$")
	public void the_room_becomes_free() {
		assertTrue(bookingRoom.isFree());
	}

}
