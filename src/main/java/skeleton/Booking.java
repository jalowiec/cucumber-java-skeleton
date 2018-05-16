package skeleton;

public class Booking {
	
	private int bookingId;
	private Person bookingPerson;
	private Room bookingRoom;
	 
	
	public Booking(int bookingId, Person bookingPerson, Room bookingRoom) {
		super();
		this.bookingId = bookingId;
		this.bookingPerson = bookingPerson;
		this.bookingRoom = bookingRoom;
	}

	public int getBookingId() {
		return bookingId;
	}
	
	public Person getBookingPerson() {
		return bookingPerson;
	}

	public Room getBookingRoom() {
		return bookingRoom;
	}
	
	

}
