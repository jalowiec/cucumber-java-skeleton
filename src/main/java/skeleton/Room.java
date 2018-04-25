package skeleton;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private int roomNumberGenerator;
	private final int roomNumber;
	private RoomState state;
	List<Operation> roomOperations = new ArrayList<>();
	
	Room() {
		roomNumberGenerator++;
		this.roomNumber = roomNumberGenerator;
		this.setFree();
	}

	public void setFree() {

		this.state = new RoomFree();

	}

	public void setBooked() {

		this.state = new RoomBooked();
		
		
	}
	
		


	public int getRoomNumber() {
		return roomNumber;
	}

	public RoomState getState() {
		return state;
	}
	
	public boolean isFree() {
		
		if(this.state instanceof RoomFree){
			return true;
		}
	
		return false; 
		
		
	}

	

}
