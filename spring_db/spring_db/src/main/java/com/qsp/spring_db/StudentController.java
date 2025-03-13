package com.qsp.spring_db;

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
public class StudentController {

	@Autowired
	StudentRepository repository;

	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		Student s = repository.save(student);
		return s;
	}

	@PutMapping("/updatestd")
	public Student updateStudent(@RequestBody Student student) {
		Student s = repository.save(student);
		return s;
	}

	@DeleteMapping("/deletestdbyid")
	public void deleteById(@RequestParam int id) {
		Optional<Student> option = repository.findById(id);
		if (option.isPresent()) {
			Student s = option.get();
			repository.delete(s);
		}
	}

	@GetMapping("/findallstd")
	public List<Student> findAllStudent() {
		List<Student> stdlist = repository.findAll();
		return stdlist;

	}

	@GetMapping("/fetchstdbyid")
	public Student fetchById(@RequestParam int id) {

		Optional<Student> option1 = repository.findById(id);
		if (option1.isPresent()) {
			Student s = option1.get();
			return s;
		}
		return null;
	}

}