package javasql;

import java.sql.*;  

public class JDBCDemo
{
	public static void main(String[] args) throws Exception
	{
		try 
		{
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	System.out.println("Driver Loaded");  
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123N@ndini04");
	System.out.println("Connection Done");  
	
	Statement stm=con.createStatement();
	System.out.println("Statement Created");  
	
	con.close(); 
}
		catch(Exception e)
		{
    System.out.println(e);
		}
		
	}
	}
