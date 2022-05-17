package ai.jobiak.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryString extends HttpServlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    { 
        res.setContentType("text/html"); 
        PrintWriter out = res.getWriter();   
        String queryString = req.getQueryString(); 
        out.println("Query String passed is  : " + queryString);   
        out.close(); 
    }
}
