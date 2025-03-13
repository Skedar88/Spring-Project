package com.qsp.spring_db;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee e = repository.save(employee);
		return e;
	}

	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee e = repository.save(employee);
		return e;
	}

	@DeleteMapping("/deletebyid")
	public void deleteById(@RequestParam int id) {
		Optional<Employee> option = repository.findById(id);
		if (option.isPresent()) {
			Employee e = option.get();
			repository.delete(e);
		}
	}

	@GetMapping("/findall")
	public List<Employee> findAllEmployee() {
		List<Employee> emplist = repository.findAll();
		return emplist;

	}

	@GetMapping("/fetchbyid")
	public Employee fetchById(@RequestParam int id) {

		Optional<Employee> option1 = repository.findById(id); // Optional class : to avoid null pointer exception
		if (option1.isPresent()) {
			Employee e = option1.get();
			return e;
		}
		return null;
	}

	@GetMapping("/employee/findByName")
	public List<Employee> findEmployeeByName(@RequestParam String name) {
		return repository.findByName(name);
	}

	@GetMapping("/employee/findByNameAndSal")
	public List<Employee> findByNameAndSal(@RequestParam String name, @RequestParam double sal) {
		return repository.findByNameAndSal(name, sal);

	}

	@GetMapping("/employee/findByNameAndPhone")
	public List<Employee> findByNameAndPhone(@RequestParam String name, @RequestParam long phone) {
		return repository.findByNameAndPhone(name, phone);

	}

	@GetMapping("/getListOfSal")
	public List<Employee> findListOfEmployeeBySal(@RequestParam double sal)
	{
		return repository.findListOfEmployeeBySal(sal);
	}
	

}