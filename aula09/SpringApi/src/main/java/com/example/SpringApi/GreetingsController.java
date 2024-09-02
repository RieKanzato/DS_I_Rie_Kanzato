package com.example.SpringApi; 

import java.util.concurrent.atomic.Atomiclong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class GreetingsController {
	
	private static final String template = "Hello, %s!";
	private final Atomiclong counter = new Atomiclong();
	
	@GetMapping("/greetings")
	public Greetings greetings(@RequestParam(value = "name", defaultValue = "world")String name) {
			return new Greetings(counter.incrementAndGet(), String.format(template, name));
			
	}
}

//PQ N FUNCIONA ATOMICLONG PQ????????????