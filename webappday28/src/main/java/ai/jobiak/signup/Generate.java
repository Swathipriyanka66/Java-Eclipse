package ai.jobiak.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Generate
 */
@WebServlet("/generate")
public class Generate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final ServletContext Context = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Generate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = "root";
		String password = "admin";
		String url ="jdbc:mysql://localhost:3306/world";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
		PrintWriter out=response.getWriter();
		System.out.println("Connected to database -> :)");
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    ResultSet rs=st.executeQuery("select * from signup");
	    
		rs.first();
		ServletContext context=getServletContext();
		context.setAttribute("fname",rs.getString(1));
		context.setAttribute("email",rs.getString(2));
		context.setAttribute("mobile",rs.getString(3));
		request.setAttribute("fname",rs.getString(1));
		request.setAttribute("email", rs.getString(2));
		request.setAttribute("mobile",rs.getString(3));
		
		RequestDispatcher dispatcher=Context.getRequestDispatcher("/readsignin");
		dispatcher.forward(request,response);
		}catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}


}
