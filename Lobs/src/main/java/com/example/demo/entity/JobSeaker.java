package com.example.demo.entity;

import java.io.Serializable; 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "JobSeaker")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobSeaker implements Serializable {

	public JobSeaker(String name, String city, byte[] photo, char[] bioDate) {
		this.name = name;
		this.city = city;
		this.photo = photo;
		this.bioDate = bioDate;
	}
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String city;
	
	@Lob
	@Column(length = 1000000)
	private byte[] photo;
	
	
	@Column(length = 1000000)
	@Lob
	private char[] bioDate;
}
