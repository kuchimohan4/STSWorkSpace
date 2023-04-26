package com.jfs.security2.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfs.security2.models.AccountTransactions;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
	
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);

}
