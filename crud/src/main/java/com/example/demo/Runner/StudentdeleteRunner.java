package com.example.demo.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.dao.IStudentDao;

public class StudentdeleteRunner implements CommandLineRunner{
	
	
	 @Autowired
	 private IStudentDao dao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		
	}
      
	 
	 
}
