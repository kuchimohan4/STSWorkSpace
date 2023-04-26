package com.jfs.security2.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfs.security2.models.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByEmail(String email);
    
}
