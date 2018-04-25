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
 
	
	
