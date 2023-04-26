package com.kuchi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kuchi.beans.limit;
import com.kuchi.configuration.configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private configuration configuratio;
	
	@GetMapping("/limits")
	public limit getlimits() {
		return new limit(configuratio.getMinimum(),configuratio.getMaximum());
//		return new limit(0,1000);
		
	}
	

}
