package com.app.thinking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThinkingApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ThinkingApplication.class, args);
	}
	 
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(ThinkingApplication.class);
	 }

}
