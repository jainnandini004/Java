package com.maven;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.maven.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {
//	Row Mapper- An interface used by JdbcTemplate for mapping rows of a ResultSet on a per-row basis
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(1));
		emp.setEmpfirstName(rs.getString(2));
		emp.setEmplastName(rs.getString(3));
		return emp;
	}

}
