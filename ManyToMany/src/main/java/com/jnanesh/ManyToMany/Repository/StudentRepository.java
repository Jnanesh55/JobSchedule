package com.jnanesh.ManyToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnanesh.ManyToMany.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
