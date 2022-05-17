package com.jobiak.ioc3;

public class B {
	
	
	public void printingDesign() {
		
		A a= new A(); //dependency
					  //1. they cause maintenance nightmare's
					  //2. Testing
		a.print();    //(against agile methodology)
		
	}
	

}
