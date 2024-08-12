package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "ProTab")
public class Product implements Serializable {

	public Product(Integer id, String name, double price,Vender v) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.v = v;
		
	}




	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "pid")
	private Integer id;
	
	
	@Column(name = "pname")
	private String name;
	
	@Column(name = "pprice")
	private double price;
	
	
	@ManyToOne
	@JoinColumn(name = "VidFK", referencedColumnName ="vid")
	private Vender v;
	

	
	
}
