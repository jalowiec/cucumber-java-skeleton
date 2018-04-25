Feature: Reservation System 

Scenario: book free room 
	Given there is a free room 
	When person 1 books it 
	Then it is booked by person 1 
	And it can no longer be booked 
	
 
