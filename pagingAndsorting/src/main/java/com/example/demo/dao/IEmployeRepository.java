package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface IEmployeRepository extends CrudRepository<Employee, Integer> {

}
