package skeleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HotelManager {

	private List<Room> roomList = new ArrayList<>();
	private List<Person> personList = new ArrayList<>();
	private Set<Booking> bookingList = new TreeSet<>();

	public void addRoom() {
		Room addedRoom = new Room();
		roomList.add(addedRoom);
	}

	public Room getAddedRoom() {
		return roomList.get(roomList.size() - 1);
	}

	public void bookingRoom(Person bookingPerson, Room bookingRoom) {
		bookingRoom.setBooked();
		Booking booking = new Booking(bookingPerson, bookingRoom);
		bookingList.add(booking);

	}

	public void cancelBooking(Person cancelingPerson, Booking booking) {
		booking.getBookingRoom().setFree();
		bookingList.remove(booking);

	}
	
	public void showBookings() {
		for(Booking booking : bookingList) {
			System.out.println(booking.getBookingPerson().getPersonId());
		}

	}

	public void addPerson(int personId, String personName, String personSurname) {
		personList.add(new Person(personId, personName, personSurname));
		// TODO - obs�uga podwojnego dodawania osoby
	}

	// public void addToHistory(RoomCommand command) {
	// history.add(command);
	/// }

	/*
	 * public Room getRoom(int roomNumber) {
	 * 
	 * for(Room element : roomList) { if(element.getRoomNumber() == roomNumber)
	 * return element;
	 * 
	 * } return null; }
	 * 
	 * public Person getPerson(int personId) {
	 * 
	 * for(Person element : personList) { if(element.getPersonId() == personId)
	 * return element;
	 * 
	 * } return null; }
	 */
}
