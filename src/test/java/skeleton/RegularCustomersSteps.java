package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class RegularCustomersSteps {


@Given("^a customer has made at least (\\d+) bookings in the last (\\d+) months$")
public void a_customer_has_made_at_least_bookings_in_the_last_months(int arg1, int arg2) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^he attempts to make a new booking$")
public void he_attempts_to_make_a_new_booking() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^this booking is in a 'genius' mode$")
public void this_booking_is_in_a_genius_mode() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}	

@Then("^the room is locked two times longer without a confirmation$")
public void the_room_is_locked_two_times_longer_without_a_confirmation() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}
