Feature: Reservation System 

Background:
	Given there is a free room

Scenario: book free room 
 	When person A books it 
	Then it is booked by person A 
	And it can no longer be booked

Scenario: Locking room for booking
	When a person begins to book that room
	Then the room becomes unavailable		
