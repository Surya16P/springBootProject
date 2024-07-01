package com.project.spring_boot_rest.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.spring_boot_rest.StudentRepo.StudentRepo;
import com.project.spring_boot_rest.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;

	
	public List<Student> getStudent() {
		return repo.findAll();
	}

	public Student createStudent(Student student) {
		return repo.save(student);
	}

	public Optional<Student> getStudent(int byId) {
		
		return repo.findById(byId);
	}

	public void deleteStudent(int byId) {
		
		repo.deleteById(byId);
	}

	public Student updateStudent(int byId, Student student) {

		 Optional<Student> optionalStudent = repo.findById(byId);
		 
	        if (optionalStudent.isPresent()) {   	
	        	
	            student = optionalStudent.get();
	            student.setName(student.getName());
	            student.setMarks(student.getMarks());
	            return repo.save(student);
	        } else {
	            throw new RuntimeException("Student not found with rollNo: " + byId);
	        }
	}
	
	
	

}
