package com.example.demo.Runner;


import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MobileNumber;
import com.example.demo.dao.Person;
import com.example.demo.entity.IPersonRepository;
import com.example.demo.entity.ImobileRepository;




@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ImobileRepository MR;
	
	@Autowired
	private IPersonRepository PR;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		//child object
		MobileNumber ph1 = new MobileNumber(100L,"AIRTEL","OFFICE");
		MobileNumber ph2 = new MobileNumber(101L,"AIRTEL","PERSONAL");
		
		
		// parent object
		Person person1 = new Person(10,"JAI_SHARMA","INDORE");
		
		ph1.setPerson(person1);
		ph2.setPerson(person1);
		
		Set<MobileNumber> Mobile_SET_1 = Set.of(ph1, ph2);
		
		person1.setMobile(Mobile_SET_1);
		
		PR.save(person1);
		
		MobileNumber ph3 = new MobileNumber(102L,"GIO","OFFICE");
		MobileNumber ph4 = new MobileNumber(103L,"IDEA","PERSONAL");
		
		Person person2 = new Person(10,"DIVYA_ARORA","INDORE");
		
		ph3.setPerson(person2);
		ph4.setPerson(person2);
		
		MR.saveAll(Arrays.asList(ph3, ph4));
		
		
		
		
	}

	
		
		
		
}

	
	
	



