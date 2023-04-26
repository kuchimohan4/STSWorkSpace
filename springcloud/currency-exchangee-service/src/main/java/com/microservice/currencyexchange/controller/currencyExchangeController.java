package com.microservice.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.currencyexchange.beans.currencyExchange;
import com.microservice.currencyexchange.repository.currrencyExchangeRepository;
@RestController
public class currencyExchangeController {
	@Autowired
	private Environment environment;
	@Autowired
	private currrencyExchangeRepository currrencyExchangeRepository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public  currencyExchange retreveexchangeValue(
			@PathVariable("from") String fromcur,
			@PathVariable("to") String tocur) {
				
		int a=1;
		String port=environment.getProperty("local.server.port");
		
//		currencyExchange currencyExchange = new currencyExchange(1000L, fromcur, tocur,BigDecimal.valueOf(65.0));
		currencyExchange currencyExchange=currrencyExchangeRepository.findByFromAndTo(fromcur, tocur);
		if(currencyExchange==null) {
			throw new RuntimeException("no exchange details avaliable for "+fromcur+" to "+tocur);
		}
		currencyExchange.setEnvironment(port+" helo");
		return currencyExchange;
		
		
	}

}
