Feature: booking free room 

Scenario: book free room 
	Given there is a free room 
	When person A books it 
	Then it is booked by person A 
	And it can no longer be booked 