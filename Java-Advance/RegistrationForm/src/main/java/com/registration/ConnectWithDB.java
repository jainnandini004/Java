package com.registration;

import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ConnectWithDB {
	static int status=0;
	public static int register(JavaBeanStruct u)
	{
	
	try {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDatabase","root","123N@ndini04");
	
	PreparedStatement ps=con.prepareStatement("insert into RegisteredInfo values(?,?,?)");
	
	ps.setString(1,u.getName());
	ps.setString(2,u.getEmail());
	ps.setString(3,u.getPassword());
	
	status = ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
	}
}

