package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Models;
import com.example.demo.entity.Product;

public interface IModelsRepository extends JpaRepository<Models, Integer> {

}
