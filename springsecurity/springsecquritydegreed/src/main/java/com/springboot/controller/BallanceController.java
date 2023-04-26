package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BallanceController {

	@GetMapping("/MyBalance")
	public String myBalance() {
		
		return "no balance as of now";
	}
}
