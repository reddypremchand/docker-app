package com.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloWorld {

	@GetMapping
	public String getMessage() {
		return "Hello World";
	}
	@GetMapping("/name")
	public String getName() {
		return "Premchand Reddy";
	}
	@GetMapping("/num")
	public String getNumber() {
		return "9348447714";
	}
}
