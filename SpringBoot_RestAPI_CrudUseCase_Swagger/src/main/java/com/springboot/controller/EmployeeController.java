package com.springboot.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	//controller call service method with the help of Service class object means controller class depend on Service class
	
	
	//Insert----------------------------------------------------------------------------------------------------------------------------------------
	@PostMapping("/empinsert")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
	}
	
	
	
	//Delete-----------------------------------------------------------------------------------------------------------------------------------------
	@DeleteMapping("/empdelete/{id}")
	public String deleteById(@PathVariable("id") int id)
	{
	service.deleteById(id);
	return  "department - "+ id +" deleted successfully";
	}
	
	

	//Update-----------------------------------------------------------------------------------------------------------------------------------------
	@PutMapping("/empupdate/{id}")
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee)
	{
		return service.updateEmployee(id,employee);
	}
	
	
	//Fetch by id------------------------------------------------------------------------------------------------------------------------------------
	/*
	 * @GetMapping("/employeeid/{id}")
	 * public Employee fetchById(@PathVariable("id")int id) 
	 * { 
	 * return service.fetchById(id); 
	 * }
	 */
	
	
/*------------------------------------------------------Add link Harteose------------------------------------------------------------------------------*/

	@GetMapping("/employeeid/{id}")
    public EntityModel<Employee> fetchById(@PathVariable("id") int id)
    {
        Employee emp = service.fetchById(id);
        EntityModel<Employee> model = EntityModel.of(emp);

        WebMvcLinkBuilder linkToDepts = linkTo(methodOn(this.getClass()).fetchAllEmployee());
        model.add(linkToDepts.withRel("all-employee"));

        return model;
    }

	
	
	//Fetch all data---------------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/employeeall")
	public List<Employee> fetchAllEmployee()
	{
		return service.fetchAllEmployee();
	}
	
	
	//Fetch employee details with the help of name and department------------------------------------------------------------------------------------
	
	@GetMapping("/employeeNameAndDepartment/{name}/{department}")
	public Employee fetchByNameAndDepartment(@PathVariable("name") String name,@PathVariable("department")String department)
	{ 
		return service.fetchByNameAndDepartment(name,department); 
		}
	
	
	
	
	//Fetch employee details with the help of name-------------------------------------------------------------------------------------------------
	@GetMapping("/employees1/{name}")
	public List<Employee> fetchByName(@PathVariable("name") String name)
	{
		return service.fetchByName(name);
	}
	
	
	//Fetch employee details with the help of department------------------------------------------------------------------------------------------
	@GetMapping("/employees2/{department}")
	public List<Employee> fetchByDepartment(@PathVariable("department") String department)
	{
		return service.fetchByDepartment(department);
	}
	
	
}
