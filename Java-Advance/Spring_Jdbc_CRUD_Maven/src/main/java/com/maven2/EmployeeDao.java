package com.maven2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.maven.Employee;
import com.maven.EmployeeRowMapper;

//Main logic for Query

@Component("dao")
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

//	public int saveEmployee(Employee e)
//	{

//		INSERT OPERATION
//		String sql = "insert into employee values(?,?,?)"; 
//		return jdbcTemplate.update(sql, e.getEmpId(),e.getEmpfirstName(),e.getEmplastName());

//		DELETE OPERATION
//		  String sql="Delete from Employee where empId=? ";
//		  return jdbcTemplate.update(sql,e.getEmpId());
//		 

//		 UPDATE OPERATION
//		 String sql="update Employee set empfirstName=? where empId= ? "; 
//		 return jdbcTemplate.update(sql,e.getEmpfirstName(),e.getEmpId());
//		 
//}
//	SELECT SINGLE ROW	
	public Employee read(int id) {
		String sql = "select * from Employee where empId=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
//		queryForObject() for used when we have to access data with the help of specific column name 
		return jdbcTemplate.queryForObject(sql, rowmapper, id);
	}

//	SELECT MULTIPLE ROW
	public List<Employee> findAll() {
		String sql = "select * From employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
//		query() for used when we have to access data with no specific column name 
		return jdbcTemplate.query(sql, rowmapper);

	}

}
// update,delete,select query,list of rows
