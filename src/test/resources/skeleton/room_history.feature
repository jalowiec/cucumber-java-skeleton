Feature: Room history 

Scenario: print booking history for a room
	Given multiple people booked the same room 
	When a booking history is printed
	Then the list of historical bookings displays names of people booking and time the booking was made or canceled