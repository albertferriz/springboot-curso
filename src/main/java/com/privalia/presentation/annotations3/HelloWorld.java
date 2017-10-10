package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {

	private String hello;
	
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld() {
		
	}
	
	@Autowired
	public HelloWorld(@Value("Hello World from constructor :)") String hello) {
		this.hello = hello;
	}
	
	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}
	
}
