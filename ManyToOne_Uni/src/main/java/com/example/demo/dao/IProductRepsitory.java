package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface IProductRepsitory extends JpaRepository<Product, Integer> {

}
