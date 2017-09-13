package com.jsp.DBConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.getterssetters.getssets;

public class DBOperations {	
		public static boolean validate(getssets gets){			
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		boolean status = false;
		
		String url = "jdbc:mysql://localhost:3307/";  
        String dbName = "jsp";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "password";  
	
        try{
        	Class.forName(driver).newInstance();
        	conn = DriverManager.getConnection(url + dbName, userName, password);
        	pst = conn.prepareStatement("select * from users where uid=? and password=?");
        	pst.setString(1, gets.getUid());
        	pst.setString(2, gets.getPassword());
        	        	
        	rs = pst.executeQuery();
        	status = rs.next();
        	
        	
        }catch(Exception e){
        	System.out.println(e);
        }finally{ 	
        	
        	 if (conn != null) {  
                 try {  
                     conn.close();  
                 } catch (SQLException e) {  
                     e.printStackTrace();  
                 }  
             }  
             if (pst != null) {  
                 try {  
                     pst.close();  
                 } catch (SQLException e) {  
                     e.printStackTrace();  
                 }  
             }  
             if (rs != null) {  
                 try {  
                     rs.close();  
                 } catch (SQLException e) {  
                     e.printStackTrace();  
                 }  
             }       	
        	
        }
        return status;
	}	
		
		public static boolean Registration(getssets sets){

			Connection conn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			boolean status = false;
			String url = "jdbc:mysql://localhost:3307/";  
	        String dbName = "jsp";  
	        String driver = "com.mysql.jdbc.Driver";  
	        String userName = "root";  
	        String password = "password"; 
	        try{
	        	Class.forName(driver).newInstance();
	        	conn = DriverManager.getConnection(url + dbName, userName, password);
	        	pst = conn.prepareStatement("Insert into users values(?,?,?,?,?,?,?)");
	        	pst.setString(1, sets.getUid());
	        	pst.setString(2, sets.getName());
	        	pst.setString(3, sets.getPassword());
	        	pst.setString(4, sets.getPhone());
	        	pst.setString(5, sets.getEmail());
	        	pst.setString(6, sets.getAddress());
	        	pst.setString(7, sets.getLanguages());
	        	System.out.println("DB operations :"+pst);
	        	        	
	        	
	        	pst.executeUpdate();
	        	if(validate(sets)){
	        		status = true;
	        	}
	        	      	
	        	
	        }catch(Exception e){
	        	System.out.println(e);
	        }finally{ 	
	        	
	        	 if (conn != null) {  
	                 try {  
	                     conn.close();  
	                 } catch (SQLException e) {  
	                     e.printStackTrace();  
	                 }  
	             }  
	             if (pst != null) {  
	                 try {  
	                     pst.close();  
	                 } catch (SQLException e) {  
	                     e.printStackTrace();  
	                 }  
	             }  
	             if (rs != null) {  
	                 try {  
	                     rs.close();  
	                 } catch (SQLException e) {  
	                     e.printStackTrace();  
	                 }  
	             }       	
	        	
	        }
	        return status;
	       
		
		}

}

