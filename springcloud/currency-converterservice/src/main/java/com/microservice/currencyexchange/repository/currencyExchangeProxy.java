package com.microservice.currencyexchange.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.currencyexchange.beans.currencyconversion;

//@FeignClient(name="currency-exchange",url ="localhost:8000")
@FeignClient(name="currency-exchange")
public interface currencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public  currencyconversion retreveexchangeValue(
			@PathVariable("from") String fromcur,
			@PathVariable("to") String tocur);
	

}
