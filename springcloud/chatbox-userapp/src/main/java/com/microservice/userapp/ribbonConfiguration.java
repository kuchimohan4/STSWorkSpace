package com.microservice.userapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;


public class ribbonConfiguration {
	
	@Autowired
	IClientConfig rebbonclient;
	
	  @Bean
	  public IPing ping(IClientConfig rebbonclient) {
		  
		  return new PingUrl();
	  }
  @Bean
  public IRule rule(IClientConfig rebbonclient) {
	  
	  return new AvailabilityFilteringRule();
  }
}
