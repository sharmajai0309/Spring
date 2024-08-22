package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
