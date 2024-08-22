package com.springframework.section3.services.i18n;

import com.springframework.section3.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}
}