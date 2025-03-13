package com.qsp.spring_db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

	List<Employee> findBySal(double sal);

	List<Employee> findByNameAndSal(String name, double sal);

	List<Employee> findByNameAndPhone(String name, long phone);
	

	@Query("select e from Employee e where  e.sal>=:sal")
	List<Employee> findListOfEmployeeBySal(double sal);
}
