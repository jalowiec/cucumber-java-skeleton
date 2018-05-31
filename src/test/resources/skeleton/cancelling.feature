Feature: Cancelling


Scenario: cancel booking 
	Given person A has a booking
	When he cancels his booking 
	Then the room becomes free 

Scenario: Releasing booking lock if no booking made
	Given a person started booking
	When 10 minutes elapses and the booking is still not complete
	Then the room becomes available again
	And person A cannot complete booking
	

