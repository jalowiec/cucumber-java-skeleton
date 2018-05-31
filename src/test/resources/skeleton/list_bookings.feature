Feature: List bookings

Scenario: list bookings 
	Given there are a list of rooms with some bookings made 
	When the list of bookings is displayed 
	Then each room points to a person booking it or is available 
	
Scenario: Genius view
	Given there is a room locked by a non-genius customer
	When a genius user lists available rooms
	Then this room is on that list