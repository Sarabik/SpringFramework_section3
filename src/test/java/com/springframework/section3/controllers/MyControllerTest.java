package com.springframework.section3.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {
	@Test
	void sayHelloTest() {
		MyController myController = new MyController();
		System.out.println(myController.sayHello());
	}
}