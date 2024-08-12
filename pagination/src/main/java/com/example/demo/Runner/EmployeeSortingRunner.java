package com.example.demo.Runner;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.example.demo.dao.IEmployeRepository;
import com.example.demo.dao.IEmployeePagingSortingRepo;
import com.example.demo.entity.Employee;

@Component
public class EmployeeSortingRunner implements CommandLineRunner {

	@Autowired
	IEmployeePagingSortingRepo repo;
	@Autowired
	IEmployeRepository epp;
	
	@Override
	public void run(String... args) throws Exception {
		
		
//		System.out.println(epp.getClass().getName());
//	Employee E1 = new Employee(10, "Sachin", 12.23,"dr");
//		Employee E2 = new Employee(11, "Jai", 12.23,"dr");		Employee E3 = new Employee(12, "divya", 12.23,"dr");
//		Employee E4 = new Employee(13, "anurag", 12.23,"dr");
//		Employee E5 = new Employee(14, "sneha", 12.23,"dr");
//		Employee E6 = new Employee(15, "jai2", 12.23,"dr");
//		Employee E7 = new Employee(16, "Sachin1", 12.23,"dr");
//		Employee E8 = new Employee(17, "Sachin2", 12.23,"dr");
//		Employee E9 = new Employee(18, "Sachin3", 12.23,"dr");
//      epp.saveAll(List.of(E1, E2, E3,E4, E5, E6, E7, E8, E9));
//		
//      repo.findAll(Sort.by("empSal")).forEach(System.out::println);
//		repo.findAll(Sort.by(Direction.DESC,"empid")).forEach(System.out::println);
//		repo.findAll(Sort.by(Direction.DESC,"empid","empSal")).forEach(System.out::println);
		
		
//      repo.findAll(PageRequest.of(1, 2)).forEach(System.out::println);
//      Page<Employee> page1 = repo.findAll(PageRequest.of(1, 2));
//      PageRequest page = PageRequest.of(2,4);
//      System.out.println(page.hasPrevious());
//      System.out.println(page.getPageNumber());
//      System.out.println(page.getPageSize());
      
		
	}

}
