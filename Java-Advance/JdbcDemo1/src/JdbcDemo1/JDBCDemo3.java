package JdbcDemo1;

import java.sql.*;


public class JDBCDemo3 {
		public static void main(String[] args) throws Exception
		{
			try 
			{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("Driver Loaded");  
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123N@ndini04");
		System.out.println("Connection Done");  
		
		Statement st=con.createStatement();
		System.out.println("Statement Created");  
		
		  String sql = "CREATE TABLE REGISTRATION " +
                  "(id INTEGER not NULL, " +
                  " first VARCHAR(255), " + 
                  " last VARCHAR(255), " + 
                  " age INTEGER, " + 
                  " PRIMARY KEY ( id ))"; 

        st.executeUpdate(sql);
        System.out.println("Created table in given database...");   	
		
		 System.out.println("Inserting records into the table...");          
         String sql1 = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
         st.executeUpdate(sql1);
         sql1 = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
         st.executeUpdate(sql1);
         sql1 = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
         st.executeUpdate(sql1);
         sql1 = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         st.executeUpdate(sql1);
         ResultSet rs=st.executeQuery("Select * from Employees");
		con.close(); 
	}
			catch(Exception e)
			{
	    System.out.println(e);
			}			
		}
}
