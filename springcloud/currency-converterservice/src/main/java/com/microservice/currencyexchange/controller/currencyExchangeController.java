
package com.microservice.currencyexchange.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.currencyexchange.beans.currencyconversion;
import com.microservice.currencyexchange.repository.currencyExchangeProxy;
import com.microservice.currencyexchange.repository.currrencyExchangeRepository;


@Configuration(proxyBeanMethods = false)
class RestTemplateConfiguration {
   
   @Bean
   RestTemplate restTemplate(RestTemplateBuilder builder) {
       return builder.build();
   }
}

@RestController
public class currencyExchangeController {
	@Autowired
	private Environment environment;
	@Autowired
	private currrencyExchangeRepository currrencyExchangeRepository;
	@Autowired
	private currencyExchangeProxy proxy;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/{quantity}")
	public  currencyconversion retreveexchangeValue(
			@PathVariable("from") String fromcur,
			@PathVariable("to") String tocur,
			@PathVariable("quantity") int quantity) {
		
		HashMap<String, String> urivaribles=new HashMap<>();
		urivaribles.put("from", fromcur);
		urivaribles.put("to", tocur);
		ResponseEntity<currencyconversion> currencyconversion=restTemplate
				.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",currencyconversion.class,urivaribles);
		
		currencyconversion currencyExchange2=currencyconversion.getBody(); 
		
		
		if(currencyExchange2==null) {
			throw new RuntimeException("no exchange details avaliable for "+fromcur+" to "+tocur);
		}
		
		
		return new currencyconversion(currencyExchange2.getId(),currencyExchange2.getFrom(),currencyExchange2.getTo(),currencyExchange2.getConversionMultiple(),quantity,currencyExchange2.getConversionMultiple().doubleValue()*quantity,currencyExchange2.getEnvironment());
		
		
	}

	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/{quantity}")
	public  currencyconversion retreveexchangeValueFeign(
			@PathVariable("from") String fromcur,
			@PathVariable("to") String tocur,
			@PathVariable("quantity") int quantity) {
		
		
		currencyconversion currencyExchange2=proxy.retreveexchangeValue(fromcur, tocur);
		
		
		if(currencyExchange2==null) {
			throw new RuntimeException("no exchange details avaliable for "+fromcur+" to "+tocur);
		}
		
		
		return new currencyconversion(currencyExchange2.getId(),currencyExchange2.getFrom(),currencyExchange2.getTo(),currencyExchange2.getConversionMultiple(),quantity,currencyExchange2.getConversionMultiple().doubleValue()*quantity,currencyExchange2.getEnvironment()+" feign");
		
		
	}
}
