package com.boot.example.hello_world.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldControllerTest {
	HelloWorldController helloWorldController = new HelloWorldController();

	@Test
	void getGreetingWithHello() {
		String result = helloWorldController.getGreetingWithHello(null);
		assertEquals("Hello World !!", result);
	}

	@Test
	void getGreetingHelloWithName() {
		String result = helloWorldController.getGreetingWithHello("Rony");
		assertEquals("Hello Rony!!", result);
	}
}
