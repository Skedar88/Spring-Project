package com.qsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qsp.dao.EmployeeDao;
import com.qsp.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qsp.dao.EmployeeDao;
import com.qsp.dto.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/regEmp")
	public ModelAndView registerEmp(@ModelAttribute Employee employee, ModelAndView mv) {
		dao.saveEmployee(employee);
		mv.addObject("msg","Registered Employee with Id: "+employee.getId());
		mv.setViewName("msg.jsp");
		return mv;
	}
	@GetMapping("/hi")
	public String getRequest() 
	{
		return "index.jsp";
	}
	
	@GetMapping("/findById")
	public ModelAndView getEmployeeById(@RequestParam(name="id") int id, ModelAndView mv) {
		Employee emp=dao.findById(id);
		mv.addObject("e",emp);
		mv.setViewName("displayEmp.jsp");
		return mv;
	}
	@GetMapping("/findAll")
	public ModelAndView findAll( ModelAndView mv) {
		List<Employee> list=dao.findAllEmployee();
		mv.addObject("employees",list);
		mv.setViewName("displayAll.jsp");
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteEmployeeById(@RequestParam(name="id") int id, ModelAndView mv) {
		dao.deleteById(id);
		mv.setViewName("findAll");
		return mv;
	}
	@GetMapping("/edit")
	public ModelAndView updateEmployeeById(@RequestParam(name="id") int id, ModelAndView mv) {
		Employee employee=dao.findById(id);
		mv.addObject("emp",employee);
		mv.setViewName("edit.jsp");
		return mv;
	}
	@GetMapping("/update")
	public ModelAndView updateEmployeeBy(@ModelAttribute Employee e, ModelAndView mv) {
		dao.updateEmployee(e);
		mv.setViewName("findAll");
		return mv;
	}
	
}
