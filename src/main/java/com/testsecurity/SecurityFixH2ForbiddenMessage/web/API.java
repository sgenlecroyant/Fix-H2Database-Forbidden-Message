package com.testsecurity.SecurityFixH2ForbiddenMessage.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
	
	@GetMapping(value = "/message")
	public String getHelloWorldMessage() {
		return "Hello World";
	}
	@GetMapping(value = "/")
	public String home() {
		return "Hello Home";
	}

}
