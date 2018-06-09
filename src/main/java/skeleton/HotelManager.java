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
					+ operation.getOperationMaker().getCustomerName() + " "
					+ operation.getOperationMaker().getCustomerSurname());
		}
	}


	public void bookingRoom(Customer customer, Room room) {
		startBooking(customer, room);
		if(isCompleteBookingPossible(customer, room)) {
			completeBooking(customer, room);
		}
	}

	public void startBooking(Customer lockingCustomer, Room room) {
		room.setLocked();
		RoomLocked roomLocked = (RoomLocked) room.getState();
		roomLocked.setLockingCustomer(lockingCustomer);

	}
	
	public void completeBooking(Customer bookingCustomer, Room room) {
		room.setBooked();
		RoomBooked roomBooked = (RoomBooked) room.getState();
		roomBooked.setBookingCustomer(bookingCustomer);
		room.roomOperations.add(new Operation(RoomOperation.Reservation, bookingCustomer));
	}
	
	public boolean isCompleteBookingPossible(Customer customer, Room room) {
		if(!room.isLocked()) {
			return false;
		}
		if(room.getState() instanceof RoomLocked) {
			RoomLocked roomLocked = (RoomLocked) room.getState();
			if(!customer.equals(roomLocked.getLockingCustomer())){
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public void cancelBooking(Customer cancellingCustomer, Room cancellingRoom) {
		for (Room room : hotel.getRoomList()) {
			if (room.equals(cancellingRoom)) {
				room.setFree();
				room.roomOperations.add(new Operation(RoomOperation.Cancellation, cancellingCustomer));
			}

		}
	}



}

