package com.springboot.student;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.filter.Filter;

@Service
public class studentservice {
	@Autowired
	private studentrepositry studentrepositry;
	
	
	public List<student> getStudents(int id){
		List<student> lStudents=new ArrayList<>();
		studentrepositry.findBySectionId(id).forEach(lStudents::add);
		return lStudents;
		
	}
	public student getStudent(int id) {
		//same as using for loop and checking it lamda
//		return stuList.stream().filter(t -> (t.getId()==id)).findFirst().get();
		return studentrepositry.findById(id).get();
		
	}
	public void addstudent(student student) {
		// TODO Auto-generated method stub
		studentrepositry.save(student);
	}
	public void updatestudent(int id,student student) {
		studentrepositry.save(student);
	}
	

	
	
}
