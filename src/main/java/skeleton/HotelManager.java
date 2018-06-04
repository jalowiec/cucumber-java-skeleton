package skeleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class HotelManager {

	Hotel hotel;

	public HotelManager(Hotel hotel) {
		this.hotel = hotel;
	}

	public Room getFreeRoom() {
		for (Room room : hotel.getRoomList()) {
			if (room.getState() instanceof RoomFree) {
				return room;
			}
		}
		return null; // CO TUTAJ ZRZUCAC JAK NIE MA WOLNEGO POKOJU

	}

	public void displayBookingList() {
		for (Room room : hotel.getRoomList()) {
			if (!room.isFree()) {
				System.out.print("POKOJ " + room.getRoomNumber() + " ");
				room.getState().stateInfo();
			}
		}

	}

	public void displayAvailableRooms(Customer customer) {
		for (Room room : hotel.getRoomList()) {
			if (room.isFree() || (room.isLocked() && customer.isRegular())) {
				System.out.print("POKOJ " + room.getRoomNumber() + " ");
				room.getState().stateInfo();
			}
		}
	}

	public void displayRoomHistory(Room room) {
		for (Operation operation : room.getRoomOperations()) {
			System.out.println(operation.getOperationDate() + " " + operation.getOperationType() + " "
					+ operation.getOperationMaker().getCustomerName()  + " " 
					+ operation.getOperationMaker().getCustomerSurname());
		}
	}

	/// PODWOJNE ZABLOKOWANIE POKOJU

	public void bookingRoom(Customer bookingCustomer, Room bookingRoom) {
		bookingRoom.setBooked();
		RoomBooked roomBooked = (RoomBooked) bookingRoom.getState();
		roomBooked.setBookingCustomer(bookingCustomer);
		bookingRoom.roomOperations.add(new Operation(RoomOperation.Reservation, bookingCustomer));
	}

	public void cancelBooking(Customer cancellingCustomer, Room cancellingRoom) {
		for (Room room : hotel.getRoomList()) {
			if (room.equals(cancellingRoom)) {
				room.setFree();
				room.roomOperations.add(new Operation(RoomOperation.Cancellation, cancellingCustomer));
			}

		}
	}

	public void lockingRoom(Customer lockingCustomer, Room room) {
		room.setLocked();
		RoomLocked roomLocked = (RoomLocked) room.getState();
		roomLocked.setLockingCustomer(lockingCustomer);

	}

	/*
	 * public Booking getBooking(Hotel hotel) { System.out.println("GET BOOKING");
	 * for (Booking booking : hotel.getBookingList()) {
	 * System.out.println(booking.getBookingId()); }
	 * 
	 * return hotel.getBookingList().get(0); }
	 * 
	 * 
	 * public void lockingRoom(Room room) { room.setLocked(); lockedRooms.add(room);
	 * 
	 * }
	 * 
	 * public void showBookings() { for (Booking booking : bookingList) {
	 * System.out.println( booking.getBookingCustomer().getCustomerId() + ", " +
	 * booking.getBookingCustomer().getCustomerName() + ", " +
	 * booking.getBookingCustomer().getCustomerSurname()); }
	 * 
	 * }
	 * 
	 * public void showHistory(Room room) { for (Booking booking : bookingList) {
	 * System.out.println(booking.getBookingCustomer().getCustomerId()); }
	 * 
	 * }
	 * 
	 * public void addCustomer(int CustomerId, String CustomerName, String
	 * CustomerSurname) { CustomerList.add(new Customer(CustomerId, CustomerName,
	 * CustomerSurname)); // TODO - obs³uga podwojnego dodawania osoby }
	 * 
	 * public void cancelingLockedRooms(int minutesAfterLock) {
	 * 
	 * for (Room room : lockedRooms) { if (room.getState() instanceof RoomLocked) {
	 * RoomLocked roomLocked = (RoomLocked) room.getState(); if (new
	 * Date().getTime() - roomLocked.getLockDate().getTime() > minutesAfterLock *
	 * 60000) { lockedRooms.remove(room); room.setFree();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * public List<Room> getRoomList() { return roomList; }
	 */

}
