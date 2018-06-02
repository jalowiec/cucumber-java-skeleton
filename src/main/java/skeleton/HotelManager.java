package skeleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class HotelManager {

	public Room getFreeRoom(Hotel hotel) {
		for (Room room : hotel.getRoomList()) {
			if (room.getState() instanceof RoomFree) {
				return room;
			}
		}
		return null; // CO TUTAJ ZRZUCAC JAK NIE MA WOLNEGO POKOJU

	}

	public Booking bookingRoom(Customer bookingCustomer, Room bookingRoom, Hotel hotel) {
		bookingRoom.setBooked();
		RoomBooked roomBooked = (RoomBooked) bookingRoom.getState();
		roomBooked.setBookingCustomer(bookingCustomer);
		Operation operation = new Operation(RoomOperation.Reservation, bookingCustomer);
		bookingRoom.roomOperations.add(operation);
		Booking booking = new Booking(bookingCustomer, bookingRoom);
		hotel.bookingList.add(booking);
		return booking;
	}

	public void cancelBooking(Booking booking, Hotel hotel) {
		for (Booking bookingInList : hotel.getBookingList()) {
			if (booking.equals(bookingInList)) {
				booking.getBookingRoom().setFree();
				Operation operation = new Operation(RoomOperation.Cancellation, booking.getBookingCustomer());
				booking.getBookingRoom().roomOperations.add(operation);
				hotel.getBookingList().remove(booking);
				System.out.println("USUNIECIE BOOKINGGU3");
				
			}

		}
	}
	
	public void lockingRoom(Customer bookingCustomer, Room room, Hotel hotel) {
		room.setLocked();
		RoomLocked roomLocked = (RoomLocked) room.getState();
//		roomLock.setBookingCustomer(bookingCustomer);
//		Operation operation = new Operation(RoomOperation.Reservation, bookingCustomer);
//		bookingRoom.roomOperations.add(operation);
//		Booking booking = new Booking(bookingCustomer, bookingRoom);
//		hotel.bookingList.add(booking);
//		return booking;
	}

	
/*
	
	public Booking getBooking(Hotel hotel) {
		System.out.println("GET BOOKING");
		for (Booking booking : hotel.getBookingList()) {
			System.out.println(booking.getBookingId());
		}

		return hotel.getBookingList().get(0);
	}
	

	public void lockingRoom(Room room) {
		room.setLocked();
		lockedRooms.add(room);

	}

	public void showBookings() {
		for (Booking booking : bookingList) {
			System.out.println(
					booking.getBookingCustomer().getCustomerId() + ", " + booking.getBookingCustomer().getCustomerName()
							+ ", " + booking.getBookingCustomer().getCustomerSurname());
		}

	}

	public void showHistory(Room room) {
		for (Booking booking : bookingList) {
			System.out.println(booking.getBookingCustomer().getCustomerId());
		}

	}

	public void addCustomer(int CustomerId, String CustomerName, String CustomerSurname) {
		CustomerList.add(new Customer(CustomerId, CustomerName, CustomerSurname));
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
*/
	
}
