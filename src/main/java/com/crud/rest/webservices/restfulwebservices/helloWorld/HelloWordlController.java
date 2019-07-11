package com.crud.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
public class HelloWordlController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello world la";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public helloWorldBean helloWorldBean()
	{
		throw new RuntimeException("Some Error has occured! Contact support ...");
		//return new helloWorldBean("Hello world I am from India");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public helloWorldBean helloWorldpathVariable(@PathVariable String name)
	{
		return new helloWorldBean(String.format("Hello world, %s", name));
	}

}
