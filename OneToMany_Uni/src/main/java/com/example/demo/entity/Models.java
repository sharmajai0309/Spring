package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Modeltab")
public class Models implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "mid")
    private Integer ModelId;
	
	@Column(name = "mcode")
	private String modelCode;
	@Column(name = "mdata")
	private String ModelData;
	
}
