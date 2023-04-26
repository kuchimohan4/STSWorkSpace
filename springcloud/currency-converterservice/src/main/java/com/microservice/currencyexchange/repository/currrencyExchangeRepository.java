package com.microservice.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.currencyexchange.beans.currencyconversion;
@Repository
public interface currrencyExchangeRepository extends JpaRepository<currencyconversion, Long> {
	
	currencyconversion findByFromAndTo(String from,String to);
}
