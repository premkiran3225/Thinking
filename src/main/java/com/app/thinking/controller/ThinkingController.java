package com.app.thinking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThinkingController {

	@GetMapping("/")
	public String homePage() {
		return "Welcome to Spring Boot API";
	}

}
