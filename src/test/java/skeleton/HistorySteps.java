package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pl.edu.agh.to.booking.hotelProvider.HotelProvider;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;



public class HistorySteps {

	Hotel hotel = HotelProvider.getExampleHotel();
	HotelManager hotelManager = HotelProvider.getExampleHotelManager(hotel);
	Room bookingRoom;
	
	
	@Given("^multiple people booked the same room$")
	public void multiple_people_booked_the_same_room() {
		bookingRoom = hotelManager.getFreeRoom();
		hotelManager.bookingRoom(HotelProvider.getCustomerFromList(0), bookingRoom);
		hotelManager.bookingRoom(HotelProvider.getCustomerFromList(1), bookingRoom);
		hotelManager.cancelBooking(HotelProvider.getCustomerFromList(0), bookingRoom);
				
	}

	@When("^a booking history is printed$")
	public void a_booking_history_is_printed() {
	    hotelManager.displayRoomHistory(bookingRoom);
	}

	@Then("^the list of historical bookings displays names of people booking and time the booking was made or canceled$")
	public void the_list_of_historical_bookings_displays_names_of_people_booking_and_time_the_booking_was_made_or_canceled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	


	
}
