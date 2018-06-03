package skeleton;

import java.util.ArrayList;
import java.util.List;


public class Hotel {
	
	List<Customer> customerList = new ArrayList<>();
	List<Room> roomList = new ArrayList<>();
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public List<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	
	
	

}
