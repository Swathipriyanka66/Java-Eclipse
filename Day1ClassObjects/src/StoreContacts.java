import java.util.Arrays;

public class StoreContacts {
	
	private Contact3 contacts[] = new Contact3[3];

	public StoreContacts() {
		
		
	}

	public StoreContacts(Contact3[] contacts) {
		
		this.contacts = contacts;
	}

	public Contact3[] getContacts() {
		return contacts;
	}

	public void setContacts(Contact3[] contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "StoreContacts [contacts=" + Arrays.toString(contacts) + "]";
	}
	
	
	
	
}
