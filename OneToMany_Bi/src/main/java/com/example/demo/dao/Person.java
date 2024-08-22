package com.example.demo.dao;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@Table(name = "OTM_BI_PERSIONS")
public class Person implements Serializable {

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	public Person(Integer pid, String pname, String paddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
	}


	@Column(name = "pname")
	private String pname;
	private String paddress;
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "person")
//	@JoinColumn(name = "pidFK", referencedColumnName ="pid")
	private Set<MobileNumber> mobile;
	

}
