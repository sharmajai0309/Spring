package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

@Setter
@ToString
@Getter
@Entity
@RequiredArgsConstructor
@Table(name = "emptab")
public class Employee implements Serializable {

	public Employee(Integer empid, String empname, Double empsal, Department dob) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.dob = dob;
	}



	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "eid")
	private Integer empid;
	
	@Column(name = "ename")
	private String empname;
	

	@Column(name = "esal")
	private Double empsal;
	
	@ManyToOne
	@JoinColumn(name = "deptIdFK",referencedColumnName = "did")
	private Department dob;

}
