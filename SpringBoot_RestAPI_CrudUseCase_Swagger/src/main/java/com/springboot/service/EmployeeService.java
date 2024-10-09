package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
//Service class call repository method with the help of repository class object means Service class depend on Repository class
	
	
	
//Insert-------------------------------------------------------------------------------------------------------------------------------------------
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	
	
// Delete By Id-------------------------------------------------------------------------------------------------------------------------------------
	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	
	
	
//Update---------------------------------------------------------------------------------------------------------------------------------------------
		public Employee updateEmployee(int id, Employee employee) {
			Employee emp = repository.findById(id).get();
			emp.setName(employee.getName());
			emp.setDepartment(employee.getDepartment());
			return repository.save(emp);
		}
		
		
		
//Fetch By Id----------------------------------------------------------------------------------------------------------------------------------------
	public Employee fetchById(int id) {
		return repository.findById(id).get();
	}



//Fetch all data--------------------------------------------------------------------------------------------------------------------------------------
	public List<Employee> fetchAllEmployee() {
		return repository.findAll();
	}

	
	
	
//Fetch by Employee Name and Department---------------------------------------------------------------------------------------------------------------
	
	 public Employee fetchByNameAndDepartment(String name,String department) 
	 { 
		 return repository.findByNameAndDepartment(name,department); 
		 }
	 


	
//Fetch by Employee Name---------------------------------------------------------------------------------------------------------------------------------
		public List<Employee> fetchByName(String name)
		{
			return repository.findByName(name);
		}

		
//Fetch by Employee Department------------------------------------------------------------------------------------------------------------------------------
		public List<Employee> fetchByDepartment(String department)
		{
			return repository.findByDepartment(department);
		}


		
	}
	
