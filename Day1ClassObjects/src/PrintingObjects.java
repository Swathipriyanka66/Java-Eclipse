
public class PrintingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contact3 contact = new Contact3(1,"priya",756926166,"priya@goast.com","jobiak");
		//reflection API - code which runs behind our code
		
		System.out.println(contact.getClass().getTypeName());
		System.out.println(contact);
		}

}
