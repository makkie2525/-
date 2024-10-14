package com.example.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class IndexController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("初期画面だよ！" + "id" + counter.incrementAndGet() + " " + String.format(template, name));
		return "index";
	}
}
