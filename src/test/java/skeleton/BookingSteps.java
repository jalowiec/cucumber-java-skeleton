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

	@When("^person A books it$")
	public void person_A_books_it(int personId) {
		hotel.getAddedRoom().setBooked(personId);	
	}

	@Then("^it is booked by person A$")
	public void it_is_booked_by_personA(int bookingPersonId, RoomBooked roomBooked) {
		assertEquals(bookingPersonId, roomBooked.getBookingPerson() );
	}

	
	@And("^it can no longer be booked")
	public void it_can_no_longer_be_booked(Room room) {
		assertFalse(room.canBeBooked());
	}
}
