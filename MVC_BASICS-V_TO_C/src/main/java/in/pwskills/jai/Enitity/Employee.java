package in.pwskills.jai.Enitity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
	private int empid;
    private String empName;
    private double empsal;
    private String empwd;
    private String empDept;
    private String empAddr;

    // Getters and Setters
   
}
