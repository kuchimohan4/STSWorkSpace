package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class contactController {
	@GetMapping("/contact")
	public String saveContactDetails() {
		
		return "no contact info as of now";
	}

}
