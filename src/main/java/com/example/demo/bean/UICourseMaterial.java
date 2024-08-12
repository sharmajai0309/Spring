package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("UI")
public final class UICourseMaterial implements iMaterial {

	static {
		System.out.println("UICourseMaterial is loaded ");
	}
	public UICourseMaterial() {
		System.out.println("UICourseMaterial object is loaded");
	}
	@Override
	public String CourseCountent() {
		// TODO Auto-generated method stub
		return  "learn HTML and cSS";
	}

	@Override 
	public Double Price() {
		// TODO Auto-generated method stub
		return 7000.89;
	}

}
