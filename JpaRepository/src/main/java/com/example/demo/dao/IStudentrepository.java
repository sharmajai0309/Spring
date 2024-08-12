package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Student;

public interface IStudentrepository extends JpaRepository<Student, Integer> {
	
	 
}
