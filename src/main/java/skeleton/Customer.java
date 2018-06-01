package skeleton;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerSurname;
	public Customer(int customerId, String customerName, String customerSurname) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	
	
	
	
	

}
