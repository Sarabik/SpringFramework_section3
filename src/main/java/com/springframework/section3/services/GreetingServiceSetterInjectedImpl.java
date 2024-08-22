package com.springframework.section3.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterInjectedImpl
	implements GreetingService {
	@Override
	public String sayGreeting() {
		return "GreetingServiceSetterInjectedImpl used";
	}
}
