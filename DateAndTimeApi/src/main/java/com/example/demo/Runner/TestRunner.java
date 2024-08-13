package com.example.demo.Runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ICustomerRepository;
import com.example.demo.entity.Customer;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ICustomerRepository repo;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Customer cust = new Customer("jai", LocalDateTime.of(1990, 10, 21, 15, 10, 3),
                LocalTime.now(), LocalDate.now());
		
		repo.save(cust);
		System.out.println("Customer date saved");
		
	}

}
