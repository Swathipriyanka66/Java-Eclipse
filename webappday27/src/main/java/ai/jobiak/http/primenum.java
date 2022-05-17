package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class primenum
 */
@WebServlet("/primenum")
public class primenum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public primenum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String str = request.getParameter("value");
		int n=Integer.parseInt(str);  

		  int i,m=0,flag=0;      
		     
		  m=n/2;      
		  if(n==0||n==1){  
		   out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { out.println(n+" is prime number"); }  

		
	}
		  PrintWriter out1 = response.getWriter();
			String str1 = request.getParameter("value");
			int n1=Integer.parseInt(str1);  

			  int i1,m1=0,flag1=0;      
			     
			  m1=n1/2;      
			  if(n1==0||n1==1){  
			   out1.println(n1+" is not prime number");      
			  }else{  
			   for(i1=2;i1<=m1;i1++){      
			    if(n1%i1==0){      
			     out1.println(n1+" is not prime number");      
			     flag1=1;      
			     break;      
			    }      
			   }      
			   if(flag1==0)  { out1.println(n1+" is prime number"); }  

			
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
