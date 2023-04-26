package com.jfs.security2.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jfs.security2.custmor.Customer;

public interface CustomerRepositry extends CrudRepository<Customer, Long> {

	List<Customer> findByEmail(String email);

}
