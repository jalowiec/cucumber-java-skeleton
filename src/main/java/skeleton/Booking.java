package skeleton;

public class Booking {
	
	private Person bookingPerson;
	private Room bookingRoom;
	
	public Booking(Person bookingPerson, Room bookingRoom) {
		super();
		this.bookingPerson = bookingPerson;
		this.bookingRoom = bookingRoom;
	}

	public Person getBookingPerson() {
		return bookingPerson;
	}

	public Room getBookingRoom() {
		return bookingRoom;
	}
	
	

}
