
public class Contact3 {
	
	private int contactId;
	private String firstName;
	private long mobileNo;
	private String email;
	private String company;
	public int getContactId() {
		return contactId;
	}
	
	//How to make objects ready by using constructors
	public Contact3() {
		// TODO Auto-generated constructor stub
	}
	
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public Contact3(int contactId, String firstName, long mobileNo, String email, String company) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.company = company;
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Contact3 [contactId=" + contactId + ", firstName=" + firstName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", company=" + company + ", getContactId()=" + getContactId() + ", getFirstName()="
				+ getFirstName() + ", getMobileNo()=" + getMobileNo() + ", getEmail()=" + getEmail() + ", getCompany()="
				+ getCompany() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
