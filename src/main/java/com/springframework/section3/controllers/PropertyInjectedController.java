package com.springframework.section3.controllers;

import com.springframework.section3.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

	@Autowired
	GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
