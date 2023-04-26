package com.springboot.section;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface sectionrepositry extends JpaRepository<section, Integer> {
	

}
