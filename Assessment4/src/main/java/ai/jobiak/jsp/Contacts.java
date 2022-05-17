package ai.jobiak.jsp;

public class Contacts {
	
	private String name;
	private String mobileno;
	
	
	public Contacts() {
		System.out.println("bean Intialised...");
		
	}
	
	public String getname() {
		return name;
		
	}
	public void setname(String name) {
		this.name=name;
		System.out.println("contact is set..."+name);
	}
	public String getmobileno() {
		return mobileno;
	}
	public void setmobileno(String mobileno) {
		this.mobileno=mobileno;
		//System.out.println("contact is set..."+mobileno);
	}

}
