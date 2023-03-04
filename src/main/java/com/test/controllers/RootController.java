package com.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	@GetMapping("/")
	public String rootHandler() {
		return "Hello, from Spring Boot";
	}
}
