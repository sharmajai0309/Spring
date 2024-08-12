package com.example.demo.Runner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.IStudentrepository;
import com.example.demo.entity.Student;


@Component
public class StrudentRunner implements CommandLineRunner {
	
	@Autowired
	private IStudentrepository repo;

	@Override
	public void run(String... args) throws Exception {
		Date date = new Date();
		Student s1 = new Student(11,"jai",200.2,date);
		Student s2 = new Student(12,"divya",220.2,date);
		Student s3 = new Student(13,"jai1",210.2,date);
		List<Student> list  = repo.saveAll(Arrays.asList(s1,s2,s3));
		System.out.println(list);
		

	}

}
