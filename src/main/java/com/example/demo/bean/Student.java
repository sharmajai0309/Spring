package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	static {
		System.out.println("Student.class file is loaded");
	}
	public Student() {
		System.out.println("Student object is Created");
	} 

@Autowired
@Qualifier("java")
	 private iMaterial material;
	 public void preparation(String examName) {
		 System.out.println("Student preparation for " + examName);
		 
		 String content = material.CourseCountent();
		 Double price = material.Price();
		 System.out.println("Preparation is going on using " + content + "Materical with prize " + price);
		 System.out.println("Student preparation for " + examName);
	 }
	 
}
