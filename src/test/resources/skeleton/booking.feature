Feature: Booking

Scenario: book free room 
 	Given there is a free room
 	When person A books it 
	Then it is booked by person A 
	And it can no longer be booked

Scenario: Locking room for booking
	Given there is a free room
	When a person begins to book that room
	Then the room becomes unavailable		

Scenario: Regular customers
	Given a customer has made at least 3 bookings in the last 6 months
	When he attempts to make a new booking
	Then this booking is in a 'genius' mode
	And the room is locked two times longer without a confirmation
	
Scenario: Genius override
	Given there is a room locked by a non-genius customer
	When a genius customer makes a booking for this room
	Then the old customer cannot complete the booking
	And the room is locked
