Feature: Reservation System 

Scenario: book free room 
	Given there is a free room 
	When person 1 books it 
	Then it is booked by person 1 
	And it can no longer be booked 
	
Scenario: cancel booking 
	Given person 1 has a booking 
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
	
Scenario: Locking room for booking
	Given there is a free room
	When a person begins to book that room
	Then the room becomes unavailable	
	
Scenario: Releasing booking lock if no booking made
	Given a person started booking
	When 10 minutes elapses and the booking is still not complete
	Then the room becomes available again
	And person A cannot complete booking	
