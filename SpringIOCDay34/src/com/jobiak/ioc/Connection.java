package com.jobiak.ioc;

//great value class
//srp
public class Connection {
	
	
	public Connection getConnection() {
		
		System.out.println("providing the connection....");
		return new Connection();
		
	}

}
