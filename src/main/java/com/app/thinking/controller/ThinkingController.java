package com.app.thinking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThinkingController {

	@GetMapping("/open")
	public String homePage() {
		return "Welcome to Spring Boot API";
	}

}
