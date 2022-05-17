package com.jobiak.ioc2;

import com.jobiak.ioc.*;

public class UseConnection {
	
	
	public UseConnection(){
		
		NewConnection con=new NewConnection();
		con.getConnection();
		System.out.println("connection obtained in "+ this.getClass());
		
	}

}
