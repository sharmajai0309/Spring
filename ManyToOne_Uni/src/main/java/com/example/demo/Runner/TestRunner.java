package com.example.demo.Runner;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.IDepartmentRepository;
import com.example.demo.dao.IEmployeeRepository;
import com.example.demo.dao.IProductRepsitory;
import com.example.demo.dao.IVendorRepository;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Product;
import com.example.demo.entity.Vender;


@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository erepo;
	
	@Autowired
	private IDepartmentRepository dreppo;
	
	@Autowired
	private IVendorRepository Vrepo;
	
	@Autowired
	private IProductRepsitory prepo;
	
	
	@Override
	public void run(String... args) throws Exception {
//		  Department d1 = new Department(1001, "DEV", "JAI");
//	        Department d2 = new Department(1002, "OP", "JAI2");
//	        Department d3 = new Department(1003, "OPS", "JAI3");
//		
//		dreppo.save(d1);
//		dreppo.save(d2);
//		dreppo.save(d3);
//		
//		   Employee e1 = new Employee(10, "Bretta", 200.20, d1);
//	        Employee e2 = new Employee(11, "Colt", 300.20, d2);
//	        Employee e3 = new Employee(12, "Viper", 400.20, d1);
//	        Employee e4 = new Employee(13, "Magnum", 500.20, d2);
//		
//		erepo.save(e1);
//		erepo.save(e2);
//		erepo.save(e3);
//		erepo.save(e4);
		
		Vender v = new Vender(11, "APPLE", "USA");
		Vender v2 = new Vender(12, "Samsung", "KOREA");
		Vender v3 = new Vender(13, "LAVA", "INDIA");
		
		Vrepo.saveAll(Arrays.asList(v, v2, v3));
		
		Product p = new Product(1,"Iphone 12", 65000,v);
		Product p1 = new Product(2,"Galaxy s23",150000,v2);
		Product p2 = new Product(3,"Agni",50000,v3);
		Product p3 = new Product(2,"Iphone 14",70000,v);
		
		prepo.saveAll(Arrays.asList(p, p2, p3,p1));
		
		
		
		
		
		
		
		
	}

	
	
	
}


