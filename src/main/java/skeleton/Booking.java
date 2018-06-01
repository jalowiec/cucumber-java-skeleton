package skeleton;

public class Booking {
	
	private int bookingId;
	private Customer bookingCustomer;
	private Room bookingRoom;
	 
	
	public Booking(int bookingId, Customer bookingCustomer, Room bookingRoom) {
		super();
		this.bookingId = bookingId;
		this.bookingCustomer = bookingCustomer;
		this.bookingRoom = bookingRoom;
	}

	public int getBookingId() {
		return bookingId;
	}
	
	public Customer getBookingCustomer() {
		return bookingCustomer;
	}

	public Room getBookingRoom() {
		return bookingRoom;
	}
	
	

}
