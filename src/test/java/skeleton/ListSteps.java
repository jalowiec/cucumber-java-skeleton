package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;



public class ListSteps {

	
	HotelManager hotel = new HotelManager();
	

	@Given("there are a list of rooms with some bookings made")
	public void there_are_a_list_of_rooms_with_some_bookings_made(Person bookingPerson) {
		hotel.addRoom();
		hotel.bookingRoom(bookingPerson, hotel.getAddedRoom());
		hotel.addRoom();
		hotel.addRoom();
		hotel.bookingRoom(bookingPerson, hotel.getAddedRoom());
		
	}

	@When("^the list of bookings is displayed$")
	public void the_list_of_bookings_is_displayed() {
		hotel.showBookings();
		
	}
	
	@Then("^the list of historical bookings displays names of people booking and time the booking was made or canceled$")
	public void the_list_of_historical_bookings_displays_names_and_time(Person bookingPerson) {
		
		
	}

	


	
}
