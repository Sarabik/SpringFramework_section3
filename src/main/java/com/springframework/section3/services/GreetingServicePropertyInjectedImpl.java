package com.springframework.section3.services;

import org.springframework.stereotype.Service;

@Service("PropertyGreetingService")
public class GreetingServicePropertyInjectedImpl implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Friends don't let friends to property injection!";
	}
}
