package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
public class MobileNumber implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
	private Long RegNu;
	
	public MobileNumber(Long regNu, String provide, String type) {
		super();
		RegNu = regNu;
		Provide = provide;
		Type = type;
	}

	public MobileNumber() {
		super();
	}

	@Column(length = 20)
	private String Provide;
	
	private String Type;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "pidFK", referencedColumnName ="pid")
	private Person person;
	

}
