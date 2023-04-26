package com.springboot.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.section.sectioncontroller;


@RestController
//@RequestMapping("/api") dont use this not working
public class hellocontroller {
	
	@Autowired
	private studentservice studentservice;
	@Autowired
	private sectioncontroller sectioncontroller;
	
	@RequestMapping(value = "/students/section/{id}",method = RequestMethod.GET)
	public List<student> stunList(@PathVariable("id") int id){
		
		return studentservice.getStudents(id);
							
		
	}
	
	@RequestMapping(value = "/students/{section}/{id}",method = RequestMethod.GET)
	public student getStudent(@PathVariable("id") int id) {
		return studentservice.getStudent(id);
		
	}
	@RequestMapping(value = "/students/{id}",method = RequestMethod.PUT)
	public boolean updateStudent(@PathVariable("id") int id,@RequestBody student student) {
		 studentservice.updatestudent(id, student);
		 return true;
		
	}
	
	
	@RequestMapping(value="/section/{section}/student/{id}",method =RequestMethod.POST)
	public boolean addstudent(@RequestBody student student,@PathVariable("id") int id,@PathVariable("section") int sec) {
		student student2=new student(student.getId(), student.getName(), student.getDept(), student.getCgpa(), sectioncontroller.getsection(sec));
		studentservice.addstudent(student2);
		
		return true;
	}
	

}
