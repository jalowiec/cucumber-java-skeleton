package skeleton;

import java.util.Date;

public class Operation {

	private RoomOperation operationType;
	private Person operationMaker;
	private Date operationDate;
	
	public Operation(RoomOperation operationType, Person operationMaker) {
		
		this.operationType = operationType;
		this.operationMaker = operationMaker;
		this.operationDate = new Date();
	}
	
	
	
	
	
}
