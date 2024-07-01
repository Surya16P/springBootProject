package com.project.spring_boot_rest.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring_boot_rest.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>

}
