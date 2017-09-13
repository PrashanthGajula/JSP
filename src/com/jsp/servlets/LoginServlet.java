package com.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.DBConnectivity.DBOperations;
import com.jsp.getterssetters.getssets;

public class LoginServlet extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;  
	  
	    public void doPost(HttpServletRequest request, HttpServletResponse response)    
	            throws ServletException, IOException {    
	  
	        response.setContentType("text/html");    
	        PrintWriter out = response.getWriter();  
	       
	        String n=request.getParameter("uid");    
	        String p=request.getParameter("password");   
	        
	        getssets sets = new getssets();
	        sets.setUid(n);
	        sets.setPassword(p);
	          
	        HttpSession session = request.getSession(false);  
	        if(session!=null) { 
	        	session.setAttribute("name", n); 
	        }
	  
	        if(DBOperations.validate(sets)){    
	            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");    
	            rd.forward(request,response);    
	        }    
	        else{    
	            out.print("<p style=\"color:red\">Sorry username or password error</p>");    
	            RequestDispatcher rd=request.getRequestDispatcher("loginPage.jsp");    
	            rd.include(request,response);    
	        }    
	  
	        out.close();    
	    }    
	
	
}