package skeleton;

public class Customer {
	
	private static int customerIdGenerator;
	private final int customerId;
	private String customerName;
	private String customerSurname;
	private boolean isRegular;
	public Customer(String customerName, String customerSurname) {
		
		this.customerId = customerIdGenerator++;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		System.out.println("utworzono:" + this.customerId + " " + this.customerName + " " + this.customerSurname + " " + this.isRegular);
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
