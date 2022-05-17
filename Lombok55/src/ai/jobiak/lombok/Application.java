package ai.jobiak.lombok;

import ai.jobiak.lombok.model.Customer;

public class Application {
	
	public static void main(String args[]) {
		
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setName("John Doe");
		cust.setBalance(2000);
		
		System.out.println(cust.getBalance());
		System.out.println(cust.getName());
		System.out.println(cust.getCustId());
		System.out.println(cust);
		//hexadecimal string type hashcode
	
		Customer cust2 = new Customer(2,"Jonas Doe",3000);
		System.out.println(cust2);
		
		boolean result= cust.equals(cust2);
		System.out.println(result);
		
		Customer cust3 = new Customer(2,"Jonas Doe",3000);
System.out.println(cust3);
		
		result= cust3.equals(cust2);
		System.out.println(result);
		
	}
	
	

}
