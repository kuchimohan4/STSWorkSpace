package com.microservice.currencyexchange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;


@RestController
public class CircutBreakercontroller {
	private Logger logger=LoggerFactory.getLogger(CircutBreakercontroller.class);
	
	@GetMapping("sample-api")
//	@Retry(name = "sample-api",fallbackMethod = "hardcodeResponce" )
//	@CircuitBreaker(name = "sample-api",fallbackMethod = "hardcodeResponce" )
//	@RateLimiter(name = "default")
//	@Bulkhead(name = "default")
	public String sampleapi(){
		logger.info("sample class invocked");
//		ResponseEntity<String> forEntity=new RestTemplate().getForEntity("http://localhost:800/sample-api", String.class);
//		
//		return forEntity.getBody();
		return "sample-api";
	}
	
	public String hardcodeResponce(Exception ex) {
		
		return "fall-back responce";
	}

}
