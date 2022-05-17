package ai.jobiak.webapp;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlets implements Servlet {

	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println("entered destroy......");
			FileOutputStream fos=new FileOutputStream("Hello.txt");
			fos.write("This is added in init() to demonstrate the timing of init method".getBytes());
			fos.close();
			System.out.println("exiting init()...");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().println("this is from server().....");

	}

	public void destroy() {
		try {
			System.out.println("entered destroy");
			FileInputStream fis=new FileInputStream("Hello.txt");
			int data=fis.read();
			System.out.println();
			Thread.currentThread();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
