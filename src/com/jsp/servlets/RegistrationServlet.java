package com.jsp.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.DBConnectivity.DBOperations;
import com.jsp.getterssetters.getssets;



public class RegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;  
	  
    public void doPost(HttpServletRequest request, HttpServletResponse response)    
            throws ServletException, IOException {   
    	
    	response.setContentType("text/html");    
	    PrintWriter out = response.getWriter();  
    	
    	String userid=request.getParameter("uid");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String languages=request.getParameter("languages");
		
		getssets sets = new getssets();
		sets.setUid(userid);
		sets.setPassword(password);
		sets.setName(name);
		sets.setPhone(phone);
		sets.setEmail(email);
		sets.setAddress(address);
		sets.setLanguages(languages);
  
        if(DBOperations.Registration(sets)){   
        	out.print("<p style=\"color:blue\">Please login</p>");
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");    
            rd.forward(request,response);    
        }    
        else{    
            out.print("<p style=\"color:red\">Unable to Register, Please try again</p>");    
            RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");    
            rd.include(request,response);    
        }    
  
        out.close();    
    } 

}
