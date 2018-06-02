package skeleton;

public class Booking {
	
	private static int bookingIdGenerator;
	private final int bookingId;
	private Customer bookingCustomer;
	private Room bookingRoom;
	 
	
	public Booking(Customer bookingCustomer, Room bookingRoom) {
		super();
		this.bookingId = bookingIdGenerator++;
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
