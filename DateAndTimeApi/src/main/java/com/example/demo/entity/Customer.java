package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CustomerTable")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer custId;
	
	@Column(name = "customer_name")
	private String custName;
	
	private LocalDateTime dob;
	private LocalTime time;
	private LocalDate date;
	
	// Constructor without custId
	public Customer(String custName,LocalDateTime dob, LocalTime time, LocalDate date) {
		this.custName = custName;
		this.dob = dob;
		this.time = time;
		this.date = date;
	}
}
