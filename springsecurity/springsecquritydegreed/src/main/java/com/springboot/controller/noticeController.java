package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class noticeController {
	
	@GetMapping("/notices")
	public String getNotices() {
		
		return "no notices as of now";
	}

}
