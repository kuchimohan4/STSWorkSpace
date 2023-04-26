package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cardcontroller {
	
	@GetMapping("/Mycards")
	public String mycards() {
		
		return "no cards as of now";
	}

}
