package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@ToString
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Table(name = "producttable")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "pid")
	private Integer prodid;
	
	@Column(name = "pcode")
	private String prodCode;
	
	
	@OneToMany
	@JoinColumn(name ="ModelIdFK",referencedColumnName = "pid")
	private List<Models> mobs ; 

}
