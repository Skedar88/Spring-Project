package com.qsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.qsp.dto.Employee;

@Component
public class EmployeeDao {
	//It will create object in it and insert in this.
	@Autowired
	private EntityManager em;
	
	public void saveEmployee(Employee employee) {
		EntityTransaction et= em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();		
	}
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}
	public void deleteById(int id) {
		EntityTransaction et= em.getTransaction();
		Employee employee=findById(id);
		et.begin();
		em.remove(employee);
		et.commit();		
	}
	public void updateEmployee(Employee employee) {
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		em.merge(employee);
		et.commit();		
	}
	public List<Employee> findAllEmployee(){
		Query query=em.createQuery("Select e from Employee e");
		return query.getResultList();
	}
	public void updateById(int id) {
		EntityTransaction et= em.getTransaction();
		Employee employee=findById(id);
		et.begin();
		em.remove(employee);
		et.commit();		
	}

}
