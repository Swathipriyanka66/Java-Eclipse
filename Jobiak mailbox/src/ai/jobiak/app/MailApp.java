package ai.jobiak.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MailApp {

	public static void main(String[] args) throws Exception  {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		/*Class.forName("com.mysql.cj.jdbc.Driver");
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.print("connected to db");*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName = "root";
		String password = "admin";
		String url ="jdbc:mysql://localhost:3306/world";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("Connected to database -> :)");
		String InsertSql="Insert into mailapp values('priya@jobiak.com','assessment','completed')";
		
		long result=st.executeUpdate();
		System.out.print(result);
		

		
		/*String name[]= {"Priya","Pinky","Puppy","Jack"};
		String subject[]= {"assessment","it issue","assessment1","assessment3"};
		String content[]= {"completed","thank you","completed sir","not received sir"};
		for(int i=0;i<name.length;i++) {
			PreparedStatement pstmt=con.prepareStatement("insert into mailapp values(?,?,?,?)");
			pstmt.setString(1, name[i]);
			pstmt.setString(2, subject[i]);
			pstmt.setString(3, content[i]);
			pstmt.setInt(4, content[i].length());
			System.out.print("record inserted");*/
		}
			
		}
		
		
		
		
		/*Statement stmt=(Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("------------MENU--------------");
		System.out.println();
		
		System.out.println("select from the options");
		System.out.println("1. First Mail");
		System.out.println("2. Next Mail");
		System.out.println("3. Previous Mail");
		System.out.println("4. Last Mail");
		System.out.println("5. Search Mail");
		System.out.println("6. Exit");
	    System.out.println(" Select any option from the above... ");*/

	
	


