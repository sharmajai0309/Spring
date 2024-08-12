package com.example.demo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="prodTab")
public class Product {
	
	@Id
	@Column(name = "pid")
	private Integer pid;
	
	@Column(name = "pcode")
	private String pcode;
	
	@ElementCollection
    @CollectionTable(name = "product_colors", joinColumns = @JoinColumn(name = "product_id"))
    @OrderColumn(name ="pos") // index column
	@Column(name = "data")   //actual color data
    private List<String> colors;
	

	@ElementCollection
    @CollectionTable(name = "product_models", joinColumns = @JoinColumn(name = "pidF"))
    @Column(name ="model") // index column
	private  Set<String> models ;
	
	@ElementCollection
	@CollectionTable(name ="products_details",joinColumns = @JoinColumn(name = "pidF"))
	@MapKeyColumn(name = "code") //key column
	@Column(name ="deltails")
	private Map<String,String> details;
}
