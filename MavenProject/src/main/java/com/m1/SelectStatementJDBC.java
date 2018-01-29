package com.m1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStatementJDBC {

	public static void main(String args[])throws Exception{  

		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		Statement stmt = con.createStatement(); 
		String sql = "Select * from employee;";

		ResultSet rs = stmt.executeQuery(sql);  
		  
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" :: "+rs.getString(2)+" :: "+rs.getString(3));  
		}  
		
		con.close();  
	}
}
