package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.HelloBean;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello1()
	{
	  return "Welcome to SpringBoot REST API";
	}
	

	@GetMapping("/hello-bean")
	public HelloBean helloBean()
	{
		Wellcome wel=new Wellcome();
		String str=wel.toCheckPrivate();
		return new HelloBean(str);
	}
	
	
	@GetMapping("/hello/{name}")
	public String hello2(@PathVariable("name") String x)
	{
		return "Welcome"+x;
	}
	
}

/* @PathVariable annotation- can be used to handle template variables in the request URI mapping, and set them as method parameters.*/


/*
 * Type of Request Mapping
 * 
 * @GetMapping
 * @PostMapping
 * @PutMapping
 * @DeleteMapping
 * @PatchMapping
 */