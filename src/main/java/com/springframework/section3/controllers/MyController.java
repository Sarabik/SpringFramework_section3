package com.springframework.section3.controllers;

import com.springframework.section3.services.GreetingService;
import com.springframework.section3.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController() {
		this.greetingService = new GreetingServiceImpl();
	}

	public String sayHello() {
		System.out.println("I'm in the controller");
		return greetingService.sayGreeting();
	}

}
