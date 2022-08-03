package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdjenkensdockerintegratioApplication {

	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to micro servers ";
	}
	
	public static void main(String[] args) {
		System.out.println(" ============== welcome ======================");

		System.out.println(" ============== welcome ======================");
		SpringApplication.run(SpringbootCicdjenkensdockerintegratioApplication.class, args);
	}

}
