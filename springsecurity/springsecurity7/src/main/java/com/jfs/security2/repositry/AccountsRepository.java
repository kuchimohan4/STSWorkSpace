package com.jfs.security2.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfs.security2.models.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);

}
