package com.privalia.presentation.annotations;

import org.springframework.context.annotation.Bean;

public class SpringConfiguration {

	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
