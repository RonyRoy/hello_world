
package com.boot.example.hello_world.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetapi/v1")
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String getGreetingWithHello(@RequestParam(required = false) String name) {
		if (!StringUtils.isEmpty(name))
			return "Hello " + name + "!!";
		else
			return "Hello World !!";
	}

}
