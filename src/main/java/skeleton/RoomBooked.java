package skeleton;

public class RoomBooked implements RoomState {

	Customer bookingCustomer;

	public Customer getBookingCustomer() {
		return bookingCustomer;
	}

	public void setBookingCustomer(Customer bookingCustomer) {
		this.bookingCustomer = bookingCustomer;
	}

	@Override
	public void stateInfo() {
		System.out.println(
				"ZAJETY PRZEZ: " + bookingCustomer.getCustomerName() + " " + bookingCustomer.getCustomerSurname());
	}

}
