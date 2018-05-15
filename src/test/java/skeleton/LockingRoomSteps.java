package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LockingRoomSteps {

	//??? NIE zrobil sie background z bookingSteps
	
	
	HotelManager hotel = new HotelManager();
	Room lockingRoom;
	
	@When("^a person begins to book that room$")
	public void a_person_begins_to_book_that_room() {
		hotel.addRoom();
		lockingRoom = hotel.getFreeRoom();
	    hotel.lockingRoom(lockingRoom);
	   
	}

	@Then("^the room becomes unavailable$")
	public void the_room_becomes_unavailable() {
	    
		assertFalse(lockingRoom.isFree());
	
	    
	}
	
	
}
