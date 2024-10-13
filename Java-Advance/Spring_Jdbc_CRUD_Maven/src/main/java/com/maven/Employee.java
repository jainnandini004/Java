package com.maven;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {

	private int empId;
	private String empfirstName;
	private String emplastName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpfirstName() {
		return empfirstName;
	}
	public void setEmpfirstName(String empfirstName) {
		this.empfirstName = empfirstName;
	}
	public String getEmplastName() {
		return emplastName;
	}
	public void setEmplastName(String emplastName) {
		this.emplastName = emplastName;
	}
	
	
	public Employee(int empId, String empfirstName, String emplastName) {
		super();
		this.empId = empId;
		this.empfirstName = empfirstName;
		this.emplastName = emplastName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empfirstName=" + empfirstName + ", emplastName=" + emplastName + "]";
	}
	
	
	
	
	

}
