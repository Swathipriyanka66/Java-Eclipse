package ai.jobiak.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountercookieServlet
 */
@WebServlet("/countercookie")
public class CountercookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountercookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int count=0;
		int begining=0;
		if(begining==0) {
		Cookie counterCookie=new Cookie("visits",count+"");
		response.addCookie(counterCookie);
		//out.print("count="+count);
		begining++;		
	}
		Cookie cookies[]=request.getCookies();
		if(cookies!=null) {
			System.out.print(cookies[0]);
		}
		for(int i=0;i<cookies.length;i++) {
			
			if(cookies[i].getName().equals("visits")) {
				
				int cookieCounter = Integer.parseInt(cookies[i].getValue());
				System.out.print(cookieCounter);
				count=cookieCounter++;
			}
		}
		
		Cookie counterCookie=new Cookie("visits",count+"");
		response.setContentType("text/html");
		response.addCookie(counterCookie);
		out.print("<h2>count*"+count+"</h2>");
}

	
	}
