package skeleton;

import java.util.Date;

public class RoomLocked implements RoomState {
	
	Customer lockingCustomer;
	private Date lockDate;

	public RoomLocked() {
		super();
		Date now = new Date();
		this.lockDate = now;
	}

	public Date getLockDate() {
		return lockDate;
	}

	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}

	public void setLockingCustomer(Customer lockingCustomer) {
		this.lockingCustomer = lockingCustomer;
	}
	

	public Customer getLockingCustomer() {
		return lockingCustomer;
	}

	@Override
	public void stateInfo() {
		System.out.println("W TRAKCIE REZERWACJI PRZEZ: " + lockingCustomer.getCustomerName() + " " + lockingCustomer.getCustomerSurname());

	}

}
