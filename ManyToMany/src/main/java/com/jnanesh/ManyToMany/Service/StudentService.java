package com.jnanesh.ManyToMany.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnanesh.ManyToMany.Entity.Student;
import com.jnanesh.ManyToMany.Repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public List<Student> GetAllStudents() {
		
		return studentrepository.findAll();
	}
}
