package com.springboot.student;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface studentrepositry extends CrudRepository<student, Integer> {
	
	
	public student findByName(String name);
	public student findByDept(String name);
	public List<student> findBySectionId(int id);
	

}
