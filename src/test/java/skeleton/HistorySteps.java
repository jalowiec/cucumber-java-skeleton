package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;



public class HistorySteps {

	
	HotelManager hotel = new HotelManager();
	

	@Given("multiple people booked the same room")
	public void multiple_people_booked_the_same_room(Room room) {
		Person personA = new Person(1, "Jan", "Kowalski");
		Person personB = new Person(2, "Adam", "Wieczorek");
		Person personC = new Person(3, "Andrzej", "Nowak");
		
		hotel.addRoom();
		Room addedRoom = hotel.getAddedRoom();
		
	//	hotel.bookingRoom(personA, addedRoom);		
		hotel.cancelBooking(personA, addedRoom);
		
	//	hotel.bookingRoom(personB, addedRoom);		
		hotel.cancelBooking(personB, addedRoom);
		
	//	hotel.bookingRoom(personC, addedRoom);		
		hotel.cancelBooking(personC, addedRoom);
		
		
	}

	@When("^a booking history is printed$")
	public void a_booking_history_is_printed() {
		hotel.showBookings();
		
	}

	
	@Then("^each room points to a person booking it or is available$")
	public void each_room_points_to_a_person_booking_it_or_is_available(List<Booking> bookingList) {
		
		
	}

	


	
}
