package com.jnanesh.ManyToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnanesh.ManyToMany.Entity.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer> {

}
