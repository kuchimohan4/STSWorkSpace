package com.springboot.section;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.filter.Filter;

@Service
public class sectionservice {
	@Autowired
	private sectionrepositry studentrepositry;
	
	
	public List<section> getStudents(){
		List<section> lSections=new ArrayList<>();
		studentrepositry.findAll().forEach(lSections::add);
		return lSections;
		
	}
	public section getSection(int id) {
		//same as using for loop and checking it lamda
//		return stuList.stream().filter(t -> (t.getId()==id)).findFirst().get();
		return studentrepositry.findById(id).get();
		
	}
	public void addSection(section section) {
		// TODO Auto-generated method stub
		studentrepositry.save(section);
	}
	public void updateSection(int id,section section) {
		studentrepositry.save(section);
	}
	

	
	
}
