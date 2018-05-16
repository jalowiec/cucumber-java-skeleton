Feature: Reservation System 


	
Scenario: cancel booking 
	Given person A has a booking
	When he cancels his booking 
	Then the room becomes free 

Scenario: list bookings 
	Given there are a list of rooms with some bookings made 
	When the list of bookings is displayed 
	Then each room points to a person booking it or is available 
	
Scenario: print booking history for a room 
	Given multiple people booked the same room
	When a booking history is printed 
	Then the list of historical bookings displays names of people booking and time the booking was made or canceled	
	

Scenario: Releasing booking lock if no booking made
	Given a person started booking
	When 0 minutes elapses and the booking is still not complete
	Then the room becomes available again
	And person A cannot complete booking
	


	
	
