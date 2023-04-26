package com.microservice.chatbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chatboxController {

	
	@Value("${server.port}")
	private int port;
	
	public String returnChet() {
		
		return "current port is:"+port;
	}
	
	@GetMapping("/getPort")
	public String Chat() {
		
		
		return returnChet();
		
	}
	
	
	
}
