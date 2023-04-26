package com.jfs.security2.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfs.security2.models.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByCustomerId(int customerId);

}
