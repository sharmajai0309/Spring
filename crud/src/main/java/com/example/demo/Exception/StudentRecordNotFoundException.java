package com.example.demo.Exception;

public class StudentRecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public StudentRecordNotFoundException(String msg) {
		super(msg);
	}
	public StudentRecordNotFoundException() {
		// TODO Auto-generated constructor stub
	}

}
