package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Present {
	
	@GetMapping("/hello")
	public String helloWOrld() {
		return "Hello World";
	}
}
