package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.java.en.And;

public class BookingSteps {

	
	HotelManager hotel = new HotelManager();
	

	@Given("^there is a free room$")
	public void there_is_a_free_room() {
		hotel.addRoom();
	}

	@When("^person (\\d+) books it$")
	public void person_A_books_it(Person bookingPerson, Room bookingRoom) {
		hotel.bookingRoom(bookingPerson, bookingRoom);	
	}

	@Then("^it is booked by person (\\d+)$")
	public void it_is_booked_by_personA(Person bookingPerson, Booking booking) {
		assertEquals(bookingPerson, booking.getBookingPerson() );
	}

	
	@And("^it can no longer be booked")
	public void it_can_no_longer_be_booked(Room room) {
		assertFalse(room.isFree());
	}
}
