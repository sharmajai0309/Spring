package com.example.demo.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Exception.StudentNotFoundException;
import com.example.demo.dao.IStudentDao;
import com.example.demo.entity.Student;

@Component
public class StudentRunner   {

    @Autowired
    private IStudentDao dao;

    public void run(String... args) throws Exception {
//        System.out.println(dao.getClass().getName());
//        Student s = new Student(10, "Sachin", "MI", 34);
//        Student s1 = new Student(11, "Sachin", "M2", 34);
//        Student s2 = new Student(12, "Sachin", "M2", 34);
//        dao.saveAll(List.of(s, s1, s2)).forEach(c);
    	
//    	 Student retrievedStudent = dao.findById(11).orElseThrow(() -> new StudentNotFoundException("Student not found"));
//         System.out.println("Retrieved Student: " + retrievedStudent);
    	
      dao.findAll().forEach(System.out::println);
        
    }
}
