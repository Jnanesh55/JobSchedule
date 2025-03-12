package com.jnanesh.ManyToMany.Entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="students")
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer student_id;
   private String student_name;
   private String email;
   private String contact;
   
   @ManyToMany
   @JoinTable(   //specifies the junction table
		   
		   name="studentcourse",
		   joinColumns = @JoinColumn(name="student_id"),     // defines the foregnkey in studentcourse from students
		   inverseJoinColumns = @JoinColumn(name="course_id")  //defines the foregnkey in studentcourse from courses
		   )
   @JsonManagedReference
   private Set<Course> courses = new HashSet<>();   //defines the collection of course associated with the students
   
   //-------------getters and setters----------------
   
public int getStudent_id() {
	return student_id;
}

public void setStudent_id(int student_id) {
	this.student_id = student_id;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public Set<Course> getCourses() {
	return courses;
}

public void setCourses(Set<Course> courses) {
	this.courses = courses;
}

public String getStudent_name() {
	return student_name;
}

public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
   
   
}
