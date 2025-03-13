package com.qsp.LearnSpringBoot;

import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hi")
	public String getMessage() {
		
		return "Hello";
	}
	
	@GetMapping("/getStudent.JSON")
	public Student getStudent(@RequestBody Student student) 
	{
		return student;
	}
	
	@GetMapping("/getSalary")
	public Employee getSalary(@RequestBody Employee e) 
	{
		if(e.getSal()>=20000.00) 
		{

			e.setMsg("You are Eligible for loan");
			return e;
		}
		
		e.setMsg("You are Not Eligible for loan NOTE: You have sal more than 20000.00");
		return e;
		
	}
	
	@GetMapping("/getSalList")
	public List<Employee> getEmployeeSalList(@RequestBody List<Employee> list)
	{
		Iterator<Employee> i = list.iterator();
		
		while(i.hasNext()) 
		{
			
			Employee e = i.next();
			
			if(e.getSal()<20000.00) 
			{
			   i.remove();
			}
			
		}
		return list;
	}

}
