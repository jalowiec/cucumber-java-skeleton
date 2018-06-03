package skeleton;

import java.util.Date;

public class Operation {

	private RoomOperation operationType;
	private Customer operationMaker;
	private Date operationDate;
	
	public Operation(RoomOperation operationType, Customer operationMaker) {
		
		this.operationType = operationType;
		this.operationMaker = operationMaker;
		this.operationDate = new Date();
	}

	public RoomOperation getOperationType() {
		return operationType;
	}

	public Customer getOperationMaker() {
		return operationMaker;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	
	
	
	
	
}
