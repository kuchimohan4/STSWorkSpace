package com.springboot.student;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.filter.Filter;

@Service
public class studentservice {
	@Autowired
	private studentrepositry studentrepositry;
//	
//	public studentservice() {
//	
//			studentrepositry.save(new  student(1, "kuchi", "mech", 12));
//			studentrepositry.save(new student(2, "mohn", "csc", 24));
//			studentrepositry.save(new student(3, "hareesh", "ecs", 2));
//			studentrepositry.save(new student(4, "mohan", "ece", 1));
//			
//	}
	public List<student> getStudents(){
		List<student> lStudents=new ArrayList<>();
		studentrepositry.findAll().forEach(lStudents::add);
		return lStudents;
		
	}
	public student getStudent(int id) {
		//same as using for loop and checking it lamda
		return studentrepositry.findById(id).get();
		
	}
	public void addstudent(student student) {
		// TODO Auto-generated method stub
		studentrepositry.save(student);
	}
	

	
	
}
