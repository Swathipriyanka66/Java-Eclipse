package ai.jobiak.attributes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle.Control;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAttributesServlets
 */
@WebServlet("/attributes")
public class CreateAttributesServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final ServletContext Context = null;

    /**
     * Default constructor. 
     */
    public CreateAttributesServlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		context.setAttribute("dbName","mySQL");
		context.setAttribute("dbVersion","8.0.28");
		
		request.setAttribute("jdk","17.01");
		request.setAttribute("os", "Windows 10");
		
		RequestDispatcher dispatcher=context.getRequestDispatcher("/readattributes");
		dispatcher.forward(request,response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
