package com.example.demo.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Employee;

public interface IEmployeePagingSortingRepo extends PagingAndSortingRepository<Employee, Integer> {

	

}
