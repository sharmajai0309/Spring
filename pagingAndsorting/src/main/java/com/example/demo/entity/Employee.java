package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "employe")
public class Employee {

	@Id
	@Column(name = "eid")
	private Integer empid;
	
	@Column(name = "ename")
	private String empName;
	
	@Column(name = "esal")
	private Double empSal;
	
	
	@Column(name = "edept")
	private String empDept;
	
}
