package com.project.spring_boot_rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring_boot_rest.StudentService.StudentService;
import com.project.spring_boot_rest.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public List<Student> getStudent() {
		return service.getStudent();
	}
	
	@GetMapping("/{byId}")
	public Optional<Student> getStudent(@PathVariable int byId){
		return service.getStudent(byId);
	}
	
	 @PostMapping("/")
	 public Student createStudent(@RequestBody Student student) {
	    return service.createStudent(student);
	 }
	 
	 @DeleteMapping("/{byId}")
	 public void deleteStudent(@PathVariable int byId){
		 service.deleteStudent(byId);
	 }
	 
	 
	 @PutMapping("/{byId}")
	 
	public Student updateStudent(@PathVariable int byId,@RequestBody Student student){
		 return service.updateStudent(byId, student);
	 }
	 
	
	 

}




   

