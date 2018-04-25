package skeleton;


public class RoomBooked implements RoomState {
	
	private int bookingPersonId;

	
	RoomBooked(int bookingPersonId){
		this.bookingPersonId = bookingPersonId;
	}


	public int getBookingPerson() {
		return bookingPersonId;
	}

	public void stateDescription() {
//		System.out.println("ZAJETY (" + bookingPerson.getPersonName() + " " + bookingPerson.getPersonSurname() + ")");
		
	} 

}
