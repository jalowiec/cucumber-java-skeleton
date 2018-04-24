package skeleton;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class BookingSteps {
	   @Given("^there is a free room$")
	    public void there_is_a_free_room() {
	        System.out.println("There is a free room");
	    }

	    @When("^person A books it$")
	    public void person_A_books_it() {
	        System.out.println("Person A books it");
	    }

	    @Then("^it is booked by person A$")
	    public void it_is_booked_by_personA() {
	        System.out.println("It is bookd by person A");
	    }
	    
	    @And("^it can no longer be booked")
	    public void it_can_no_longer_be_booked() {
	        System.out.println("No longer be booked");
	    }
}
