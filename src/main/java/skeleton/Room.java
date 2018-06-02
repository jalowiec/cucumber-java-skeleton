package skeleton;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private static int roomNumberGenerator;
	private final int roomNumber;
	private RoomState state;
	List<Operation> roomOperations = new ArrayList<>();

	public Room() {
		this.roomNumber = ++roomNumberGenerator;
		this.setFree();
		System.out.println("utworzono pokoj nr: " + this.roomNumber );

	}

	public void setFree() {
		this.state = new RoomFree();
	}

	public void setBooked() {
		this.state = new RoomBooked();
	}

	public void setLocked() {
		this.state = new RoomLocked();
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public RoomState getState() {
		return state;
	}

	public boolean isFree() {

		if (this.state instanceof RoomFree) {
			return true;
		}

		return false;

	}

	public boolean isLocked() {

		if (this.state instanceof RoomLocked) {
			return true;
		}

		return false;

	}

}
