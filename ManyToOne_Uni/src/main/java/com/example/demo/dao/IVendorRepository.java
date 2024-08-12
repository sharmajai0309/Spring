package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Vender;


public interface IVendorRepository extends JpaRepository<Vender, Integer> {
	

}
