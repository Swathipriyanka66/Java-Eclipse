package ai.jobiak.http;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String str=request.getParameter("operator");
		String str1=request.getParameter("input a");
		String str2=request.getParameter("input b");
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str1);
		
		switch(str)
		{
		case "+":
			out.print("Sum of a+b="+(a+b));
			break;
		case "-":
			out.print("Difference of a+b="+(a-b));
			break;
		case "%":
			out.print("Modulo of a+b="+(a%b));
			break;
		case "*":
			out.print("Product of a+b="+(a*b));
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
