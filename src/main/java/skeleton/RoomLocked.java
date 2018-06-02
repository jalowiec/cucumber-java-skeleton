package skeleton;

import java.util.Date;

public class RoomLocked implements RoomState {
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
	
	

}
