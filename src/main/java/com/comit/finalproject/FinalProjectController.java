package com.comit.finalproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinalProjectController {
	
	@GetMapping("/sayHello")
	public String sayHellowWorld() {
		return "Hello World";
	}
}
