
package com.springboot.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.springboot.section.section;


//@Component
@Entity
public class student {
	
	@Id //for making it primery key
	private int id;
	private String name;
	private String dept;
	private int cgpa;
	@ManyToOne
	private section section;
	
	public section getSection() {
		return section;
	}
	public void setSection(section section) {
		this.section = section;
	}
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
	public student(int id, String name, String dept, int cgpa,section section) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
		this.section=section;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
