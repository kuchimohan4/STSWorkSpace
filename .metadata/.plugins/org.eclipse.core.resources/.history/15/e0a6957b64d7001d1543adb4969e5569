package com.mohan.firstboot.contro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.filter.Filter;

@Service
public class studentservice {
	private List<student> stuList= new ArrayList( Arrays.asList(
			
			new student(1, "kuchi", "mech", 12),
			new student(2, "mohn", "csc", 24),
			new student(3, "hareesh", "ecs", 2),
			new student(4, "mohan", "ece", 1)
			
			
			));
	public List<student> getStudents(){
		return stuList;
	}
	public student getStudent(int id) {
		//same as using for loop and checking it lamda
		return stuList.stream().filter(t -> (t.getId()==id)).findFirst().get();
		
	}
	public void addstudent(student student) {
		// TODO Auto-generated method stub
		stuList.add(student);
	}
	

	
	
}
