package com.docker.practice1.restcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public String getMethodName() {
		return "Hello, I am Dhivakar, Welcome to my code";
	}
	
}
