package com.springboot.student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/api") dont use this not working
public class hellocontroller {
	
	@Autowired
	private studentservice studentservice;
	
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	public List<student> stunList(){
		
		return studentservice.getStudents();
							
		
	}
	
	@RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
	public student getStudent(@PathVariable("id") int id) {
		
		return studentservice.getStudent(id);
		
	}
	
	@RequestMapping(value="/students",method =RequestMethod.POST)
	public boolean addstudent(@RequestBody student student) {
		
		studentservice.addstudent(student);
		
		return true;
	}
	

}
