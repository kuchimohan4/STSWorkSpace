package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bankcontroller {
	
	
	@GetMapping("/myAccount")
	public String myaccount() {
		
		return "no account as of now";
	}

}
