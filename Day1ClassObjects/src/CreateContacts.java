
public class CreateContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact con1 = new Contact();
		
		System.out.println(con1.contactId);
		System.out.println(con1.firstName);
		System.out.println(con1.mobileNo);
		System.out.println(con1.email);
		System.out.println(con1.company);
		
		con1.contactId=1;
		con1.firstName="Priya";
		con1.mobileNo=756926166;
		con1.email="priya@devil.com";
		con1.company="devil";
		
		System.out.println(con1.contactId);
		System.out.println(con1.firstName);
		System.out.println(con1.mobileNo);
		System.out.println(con1.email);
		System.out.println(con1.company);
		
	}

}
