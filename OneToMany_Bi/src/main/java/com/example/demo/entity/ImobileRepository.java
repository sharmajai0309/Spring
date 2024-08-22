package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.MobileNumber;

public interface ImobileRepository extends JpaRepository<MobileNumber, Long> {

}
