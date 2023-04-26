package com.jfs.security2.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfs.security2.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
