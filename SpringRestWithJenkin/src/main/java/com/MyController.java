package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value = "jenkin")
	public String sayHello() {
		return "Welcome to Spring Rest with Jenkin";
	}
}
