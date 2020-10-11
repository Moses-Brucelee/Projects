package com.eff.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/eff")
public class Welcome {

	@GetMapping(value="/")
	public String home() {
		return "Hello World";
	}
	
	@PostMapping(value = "/add")
	public String bookSession() {
		return "SessionBooking";
		
	}
}
