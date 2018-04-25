package skeleton;

public class Room {

	private int roomNumberGenerator;
	private final int roomNumber;
	private RoomState state;

	Room() {
		roomNumberGenerator++;
		this.roomNumber = roomNumberGenerator;
		this.setFree();
	}

	public void setFree() {

		this.state = new RoomFree();

	}

	public void setBooked(int bookingPersonId) {

		this.state = new RoomBooked(bookingPersonId);


	}



	public RoomState getState() {
		return state;
	}
	
	public boolean canBeBooked() {
		
		if(this.state instanceof RoomFree){
			return true;
		}
	
		return false;
	}

}
