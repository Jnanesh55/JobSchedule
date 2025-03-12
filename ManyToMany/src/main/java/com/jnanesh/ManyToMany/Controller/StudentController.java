package com.jnanesh.ManyToMany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.jnanesh.ManyToMany.Entity.Student;
import com.jnanesh.ManyToMany.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	
	@GetMapping("/give")
	
     public List<Student> GetAllStudentsCourses() {
		
		return studentservice.GetAllStudents();
	}
	

}
