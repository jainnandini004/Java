package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Employee;

//EmployeeRepository it is an interface extends JPA repository
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
/*-------------------------------------Fetch employee details with the help of name and department---------------------------------------------*/

/*-------------------------------------------- WITH JPQL------------------------------------------------------------------------------------------ */
//	@Query("FROM Employee where name =:name AND department =:department") 
//	public Employee findByNameAndDept(@Param("name") String name, @Param("department") String department);
	
/*------------------------------------------- WITHOUT JPQL----------------------------------------------------------------------------------------- */
	public Employee findByNameAndDepartment(String name,String department);
	
	
	
	
	
	
	

	
/*-----------------------------------Fetch employee details with the help of name -----------------------------------------------------------------*/

/*-------------------------------------------- WITH JPQL------------------------------------------------------------------------------------------ */
//	@Query("FROM Employee where name =:name") 
//	public Employee findByName(@Param("name") String name);

/*------------------------------------------- WITHOUT JPQL----------------------------------------------------------------------------------------- */	
	List<Employee> findByName(String name);
	
	
	
	
	
	
	
	
	
	
	
/*----------------------------Fetch employee details with the help of department-------------------------------------------------------------------*/

/*-------------------------------------------- WITH JPQL------------------------------------------------------------------------------------------ */
//	@Query("FROM Employee where department =:department") 
//	public Employee findByDept(@Param("department") String department);
	
/*------------------------------------------- WITHOUT JPQL----------------------------------------------------------------------------------------- */	
	List<Employee> findByDepartment(String department);
		

}
