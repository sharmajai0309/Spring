package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	
}
