Feature: Reservation System 

Background:
	Given there is a free room

Scenario: book free room 
 	When person 1 books it 
	Then it is booked by person 1 
	And it can no longer be booked

Scenario: Locking room for booking
	When a person begins to book that room
	Then the room becomes unavailable		
