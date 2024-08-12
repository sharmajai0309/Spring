package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
@RequiredArgsConstructor
@Entity

@Table(name = "VenTab")
public class Vender implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "vid")
	private Integer id;
	
	public Vender(Integer id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.Country = country;
	}

	@Column(name = "vname")
	private String name;
	
	@Column(name = "vcountry")
	private String Country;
	
	

}
