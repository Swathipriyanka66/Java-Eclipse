
public class CreateContacts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Contact2 con1 = new Contact2();
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
		con1.setContactId(1);
		con1.setFirstName("Priya");
		con1.setMobileNo(756926166);
		con1.setEmail("priya@devil.com");
		con1.setCompany("devil");
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
	}

}
