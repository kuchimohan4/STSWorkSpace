package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loancontroller {
	
	@GetMapping("/myLoans")
	public String myLoans() {
		
		return "no loans as of now";
	}

}
