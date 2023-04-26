package com.rest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	
	@Id
	 private int studentId;
	 private String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
