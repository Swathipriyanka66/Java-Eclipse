
public class CreateStore {

	public static void main(String[] args) {
		
		StoreContacts store = new StoreContacts();
		
		Contact3 con1 = new Contact3(1,"priya",756926166,"priya@devil.com","devil");
		Contact3 con2 = new Contact3(2,"papa",707558998,"priya@devil.com","goast");
		Contact3 con3 = new Contact3(3,"puppy",950582264,"priya@devil.com","horrorTimes");
		
		
		
		Contact3 contact3Array[] = new Contact3[3];
		contact3Array[0]=con1;
		contact3Array[1]=con2;
		contact3Array[2]=con3;
		
		store.setContacts(contact3Array);
		
		//System.out.println(store);
		
		Contact3 contacts[] = store.getContacts();
		for(Contact3 contact:contacts) {
			
			System.out.println(contact);
		}
	}

}
