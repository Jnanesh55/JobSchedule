package com.jnanesh.ManyToMany.Entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer course_id;
	private String course_name;
	private String credit;
	
	
	@ManyToMany(mappedBy = "courses")
	@JsonBackReference
	private Set<Student> students = new HashSet<>();   //defines the collection of student associated with the courses

     //------------getters and setters--------
	
	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	public String getCourse_name() {
		return course_name;
	}


	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	public String getCredit() {
		return credit;
	}


	public void setCredit(String credit) {
		this.credit = credit;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
