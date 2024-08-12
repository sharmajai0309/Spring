package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;  // Import the Date class

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Entity
public class Student implements Serializable {

    @Id
    @Column(name = "sid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "sname")
    private String stdname;
    
    @Column(name = "sfee")
    private Double sfee;
    
    @Column(name = "sdoj")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stdDoj;

    // Other fields, getters, setters, etc.
}
