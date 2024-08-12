package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("DOT")
public final class DotNetMaterial implements iMaterial{

	static {
		System.out.println("DotNetMaterial is created ");
	}
	public DotNetMaterial() {
		System.out.println("DotNetMaterial object is loaded");
	}
	@Override
	public String CourseCountent()  {
		// TODO Auto-generated method stub
		return "learn HTML and cSS and C#OOPS";
	}

	@Override
	public Double Price() {
		// TODO Auto-generated method stub
		return 50900.45;
	}

}
