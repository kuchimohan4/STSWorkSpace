package com.microservice.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.currencyexchange.beans.currencyExchange;
@Repository
public interface currrencyExchangeRepository extends JpaRepository<currencyExchange, Long> {
	
	currencyExchange findByFromAndTo(String from,String to);
}
