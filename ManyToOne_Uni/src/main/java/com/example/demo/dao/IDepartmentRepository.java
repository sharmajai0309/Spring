package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
