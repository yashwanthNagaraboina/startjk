package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String Hello() {
		return "Hello my name is Modi "
				+ " Welcome to AMAZON EC2 Online Application Made With SpringBoot";
		
	}

}
