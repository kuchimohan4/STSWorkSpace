package com.mohan.firstboot.contro;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.service.Contact;

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
	@ApiOperation(value = "find contact by id",notes = "provide an id to get student by id",response = Contact.class)
	public student getStudent(@PathVariable("id") int id) {
		return studentservice.getStudent(id);
		
	}
	
	@RequestMapping(value="/students",method =RequestMethod.POST)
	public boolean addstudent(@RequestBody student student) {
		
		studentservice.addstudent(student);
		
		return true;
	}
	

}
