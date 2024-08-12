package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("java")
public final class JavaCourseMaterial implements iMaterial {

	static {
		System.out.println("Java Course Material is created ");
	}
	public JavaCourseMaterial() {
		System.out.println("Java Course Material object is loaded");
	}
	@Override
	public String CourseCountent() {
		// TODO Auto-generated method stub
		return "first learn oops AND Java core concepts";
	}

	@Override 
	public Double Price() {
		// TODO Auto-generated method stub
		return 2000.78;
	}

}
