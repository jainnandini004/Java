package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

/* ----------------------------------------@Query annotation----------------------------------------------------------------------------------*/
	
//	JPQL	
	@Query("from Employee")
	public List<Employee> findAllEmployee();
	

	
	@Query("Select e.name from Employee e")
	public List<Object[]>findEmployeePartialInfo();
	
	
/* -------------------------------------------------------@Param annotation---------------------------------------------------------------------*/
	@Query("from Employee where name=:name")
	public List<Employee>findByName(@Param("name") String name);

	
	@Modifying//Modifying and Transactional is used with DML and DDL Query
	@Transactional
	@Query("delete from Employee where id=:id")
	int deleteEmployeeById(@Param("id") int id);
	
	
	
//	if you want to use Sql Query in Jpql (Native SQL Query)
	@Query(value = "select * from Employee",nativeQuery = true)
    public List<Employee> getAllEmployee();

/*------------------------------------------- Agreggate Funtion------------------------------------------------------------------------------------- */
//	@Query("SELECT AVG(u.salary) from Employee e")
//	int getAverageSalary();
}


/*
 * Annotation used in JPQL
 * 
 * @Query annotation- It is used in Spring Data JPA to execute both JPQL and
 * native SQL queries
 * 
 * @Param- this annotation bind method parameters to a query via a named
 * parameter.Generally used with where query.
 * 
 * @Transactional- easier to see which methods are meant to be executed as one
 * transaction, and which ones are not. You don't need @Transactional for
 * database operations that only read from the database.
 * 
 * @Modifying- The @Modifying annotation is used to enhance the @Query
 * annotation to execute not only SELECT queries but also INSERT, UPDATE,
 * DELETE, and even DDL queries.
 */

