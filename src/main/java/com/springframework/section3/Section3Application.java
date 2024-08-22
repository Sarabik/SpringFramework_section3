package com.springframework.section3;

import com.springframework.section3.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Section3Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Section3Application.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("In Main Method");
		System.out.println(controller.sayHello());
	}

}
