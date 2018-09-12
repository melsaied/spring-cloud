package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@Value("${message}")
	String message;

	@RequestMapping(value = "helloworld", method = RequestMethod.GET)
	public String helloWorld() {
		return message;
	}
}
