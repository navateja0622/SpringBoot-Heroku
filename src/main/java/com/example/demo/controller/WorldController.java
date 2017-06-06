package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
	
	@RequestMapping("/")
	public String home() {
		return "Spring Boot Application Demo";
	}

}



