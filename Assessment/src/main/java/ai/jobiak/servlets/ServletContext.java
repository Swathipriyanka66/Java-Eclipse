package ai.jobiak.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext
 */
@WebServlet("/servletcontext")
public class ServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletResponse res;
	private PrintWriter out;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{  
			  
			res.setContentType("text/html");  
			PrintWriter out=res.getWriter();  
			  
			javax.servlet.ServletContext context=getServletContext();  
			context.setAttribute("company","IBM");  
			  
			out.println("Welcome to first servlet");  
			out.println("<a href='servlet2'>visit</a>");  
			out.close();  
			  
			}catch(Exception e){
				out.println(e);
				}  
			   
			  
			}
	
	
	private void setAttribute(String string, String string2) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public String getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
