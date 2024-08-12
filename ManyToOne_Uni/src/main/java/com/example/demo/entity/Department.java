package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;


@Setter
@ToString
@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "depttab")
public class Department implements Serializable{

	public Department(Integer deptId, String deptName, String deptAdmin) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		DeptAdmin = deptAdmin;
	}

	private static final long serialVersionUID = 1L;
     
	
	@Id
	@Column(name = "did")
	private Integer deptId;
	
	@Column(name = "dname")
	private String deptName;
	
	@Column(name = "dadmin")
	private String DeptAdmin;
	
	
}
