package javasql;

import java.sql.*;

public class JDBCDemo2 {

	public static void main(String[] args)throws Exception {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDatabase","root","123N@ndini04");
		Statement s=con.createStatement();
		
		//ResultSetMetaData is an interface in java which is used to get the metadata about 
		//a ResultSet object. Whenever you query the database using SELECT statement, the result will be stored 
		//in a ResultSet object. Every ResultSet object is associated with one ResultSetMetaData object.
		ResultSet rs1=s.executeQuery("Select * from Student");
		ResultSetMetaData rsmd=rs1.getMetaData();
		
		//ResultSetMetaData interface is useful because it provides methods to get metadata from the ResultSet object 
		//like getColumnTypeName(),getColumnName(), getColumnCount() and getPrecision().
		
		System.out.println("Total number of Column = "+rsmd.getColumnCount());
		System.out.println("1st column data type and it's size is : " + rsmd.getColumnTypeName(1) + " " + rsmd.getPrecision(1));
		System.out.println("2nd column data type and it's size is : " + rsmd.getColumnTypeName(2) + " " + rsmd.getPrecision(2));
		System.out.println("3rd column data type and it's size is : " + rsmd.getColumnTypeName(3) + " " + rsmd.getPrecision(3));
		System.out.println();
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			System.out.println(" Column"+i+" Name = "+rsmd.getColumnName(i));
		}
		System.out.println();
		
		while(rs1.next())
		{
			System.out.println(rs1.getInt(1) + " " + rs1.getString(2)+" "+rs1.getString(3));
		}
		System.out.println();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
