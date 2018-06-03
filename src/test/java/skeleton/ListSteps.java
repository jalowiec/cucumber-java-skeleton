package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pl.edu.agh.to.booking.hotelProvider.HotelProvider;
import cucumber.api.java.en.Then;


public class ListSteps {

	Hotel hotel = HotelProvider.getExampleHotel();
	HotelManager hotelManager = HotelProvider.getExampleHotelManager(hotel);
	
	@Given("there are a list of rooms with some bookings made")
	public void there_are_a_list_of_rooms_with_some_bookings_made() {
		HotelProvider.makeSameBookings(hotel);
	}

	@When("^the list of bookings is displayed$")
	public void the_list_of_bookings_is_displayed() {
		hotelManager.displayBookingList();
	}
	
	@Then("^each room points to a person booking it or is available$")
	public void each_room_points_to_a_person_booking_it_or_is_available() {
			
	}

	
	
}
