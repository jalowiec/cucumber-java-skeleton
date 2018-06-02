package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;



public class HistorySteps {

	
	
	Room room;
	
	@Given("^multiple people booked the same room$")
	public void multiple_people_booked_the_same_room() {
	
	
		
	}

	@When("^a booking history is printed$")
	public void a_booking_history_is_printed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the list of historical bookings displays names of people booking and time the booking was made or canceled$")
	public void the_list_of_historical_bookings_displays_names_of_people_booking_and_time_the_booking_was_made_or_canceled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	/*

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

	
	@Then("^the list of historical bookings displays names of people booking and time the booking was made or canceled$")
	public void the_list_of_historical_bookings_displays_names_and_time(Person bookingPerson) {
		
		
	}

*/	


	
}
