
package com.springboot.section;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


//@Component
@Entity
public class section {
	
	@Id //for making it primery key
	private int id;
	private String name;
	private String dept;
	private int cgpa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public section(int id, String name, String dept, int cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	public section() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
