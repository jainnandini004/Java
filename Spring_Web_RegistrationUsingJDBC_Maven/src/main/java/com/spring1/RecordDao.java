package com.spring1;

	import java.sql.ResultSet;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.ResultSetExtractor;
	import org.springframework.stereotype.Component;
	import org.springframework.stereotype.Repository;

	import com.spring.Student;

	@Repository
	public class RecordDao {
		
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		public int register(Student e)
		{
			
//		INSERT OPERATION
//		String sql = "insert into employee values(?,?,?)"; 
//		return jdbcTemplate.update(sql, e.getStid(),e.getFirstName(),e.getLastName());
	
			
			
//		DELETE OPERATION		
//		String sql="Delete from Employee where empId=? ";		
//		return jdbcTemplate.update(sql,e.getStid());		 
			 
			
			
//		UPDATE OPERATION
			String sql="update Employee set empfirstName=? where empId= ? "; 
			return jdbcTemplate.update(sql,e.getFirstName(),e.getStid());
			 
		

      }
}
