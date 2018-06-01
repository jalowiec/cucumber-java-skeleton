package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pl.edu.agh.to.booking.hotelProvider.HotelProvider;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class BookingSteps {

	
	Hotel hotel = HotelProvider.getExampleHotel();
	
	Customer bookingPerson = new Customer(1, "Jan", "Kowalski");
	int bookingId = 100;
	Room bookingRoom;
	Booking booking;
	
	@Given("^there is a free room$")
	public void there_is_a_free_room() {
		hotel.addRoom();
		bookingRoom = hotel.getFreeRoom();
	}

	@When("^person A books it$")
	public void person_A_books_it() {
		hotel.bookingRoom(bookingId, bookingPerson, bookingRoom);
		booking = hotel.getBookingFromList(bookingId);
	}

	@Then("^it is booked by person A$")
	public void it_is_booked_by_person_A() {
		assertEquals(bookingPerson, booking.getBookingCustomer() );
	}

	@Then("^it can no longer be booked$")
	public void it_can_no_longer_be_booked() {
		assertFalse(bookingRoom.isFree());
	}	
	

}
