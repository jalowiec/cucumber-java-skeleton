package skeleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class HotelManager {

	private int bookingId;
	private List<Room> roomList = new ArrayList<>();
	private List<Room> lockedRooms = new CopyOnWriteArrayList<>();
	private List<Person> personList = new ArrayList<>();
	private List<Booking> bookingList = new ArrayList<>();
	 

	public void addRoom() {
		Room addedRoom = new Room();
		roomList.add(addedRoom);
	}
//CHYBA DO USUNIECIA
	public Room getAddedRoom() {
		return roomList.get(roomList.size() - 1);
	}

	public Room getFreeRoom() {
		for (Room room : roomList) {
			if (room.getState() instanceof RoomFree) {
				return room;
			}
		}
		return null;

	}
	// TO DO - obsluzyc sytuacje jak nie bedzie wolnego pokoju

	public void bookingAddedRoom(Person bookingPerson) {
		Room bookingRoom = getAddedRoom();
		bookingRoom.setBooked();
		Operation operation = new Operation(RoomOperation.Reservation, bookingPerson);
		bookingRoom.roomOperations.add(operation);
		Booking booking = new Booking(bookingId++, bookingPerson, bookingRoom);
		bookingList.add(booking);

	}

	public void bookingRoom(int bookingId, Person bookingPerson, Room bookingRoom) {
		bookingRoom.setBooked();
		RoomBooked roomBooked = (RoomBooked) bookingRoom.getState();
		roomBooked.setBookingPerson(bookingPerson);
		Operation operation = new Operation(RoomOperation.Reservation, bookingPerson);
		bookingRoom.roomOperations.add(operation);
		Booking booking = new Booking(bookingId, bookingPerson, bookingRoom);
		bookingList.add(booking);

	}

	// CO W TAKICH PRZYPADKACH ZWRACAC
	public Booking getBookingFromList(int bookingId) {
		
		for(Booking booking : bookingList) {
			if(booking.getBookingId() == bookingId)
				return booking;
		}
		
		return null;
	}

	public void cancelBooking(int bookingId) {
		Booking booking = getBookingFromList(bookingId);
		booking.getBookingRoom().setFree();
		Operation operation = new Operation(RoomOperation.Cancellation, booking.getBookingPerson());
		booking.getBookingRoom().roomOperations.add(operation);
		bookingList.remove(booking);

	}

	public void cancelBooking(Person cancelingPerson, Room room) {
		room.setFree();
		for (Booking booking : bookingList) {
			if (booking.getBookingRoom().equals(room)) {
				bookingList.remove(booking);
			}
		}

	}

	public void lockingRoom(Room room) {
		room.setLocked();
		lockedRooms.add(room);

	}

	public void showBookings() {
		for (Booking booking : bookingList) {
			System.out.println(booking.getBookingPerson().getPersonId() + ", " + booking.getBookingPerson().getPersonName() + ", " + booking.getBookingPerson().getPersonSurname());
		}

	}

	public void showHistory(Room room) {
		for (Booking booking : bookingList) {
			System.out.println(booking.getBookingPerson().getPersonId());
		}

	}

	public void addPerson(int personId, String personName, String personSurname) {
		personList.add(new Person(personId, personName, personSurname));
		// TODO - obs³uga podwojnego dodawania osoby
	}

	public void cancelingLockedRooms(int minutesAfterLock) {

	
		for (Room room : lockedRooms) {
			if (room.getState() instanceof RoomLocked) {
				RoomLocked roomLocked = (RoomLocked) room.getState();
				if (new Date().getTime() - roomLocked.getLockDate().getTime() > minutesAfterLock * 60000) {
					lockedRooms.remove(room);
					room.setFree();
				    
				}

			}

		}
	}
	public List<Room> getRoomList() {
		return roomList;
	}
	


}
