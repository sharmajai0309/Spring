package com.example.demo.Runner;


import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.example.demo.dao.IModelsRepository;
import com.example.demo.dao.IProductRepository;

import com.example.demo.entity.Models;
import com.example.demo.entity.Product;



@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IModelsRepository mrepo;
	
	@Autowired
	private IProductRepository prepo;
	
	@Override
	public void run(String... args) throws Exception {	 
		
		Models m1 = new Models(11, "iphone 12", "4gb");
		Models m2 = new Models(12, "iphone 14", "6gb");
		Models m3 = new Models(13, "Samsung S23","6gb");
		Models m4 = new Models(14, "Samsung S24 Ultra","8gb");
		
		Product p1 = new Product(1,"IOS",Arrays.asList(m1,m2));
		Product p2 = new Product(2,"Android",Arrays.asList(m3,m4));
		
		mrepo.saveAll(Arrays.asList(m1,m2,m3,m4));
		prepo.saveAll(Arrays.asList(p1,p2));
		
		
		
		
		
	}

	
	
	
}


