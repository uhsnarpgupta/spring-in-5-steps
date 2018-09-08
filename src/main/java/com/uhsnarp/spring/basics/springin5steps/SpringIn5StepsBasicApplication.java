package com.uhsnarp.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.uhsnarp.spring.basics.springin5steps.properties.ExternalService;

@Configuration
@ComponentScan()
@PropertySource("classpath:app.properties")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			ExternalService service = applicationContext.getBean(ExternalService.class);
			System.out.println(service.returnServiceUrl());
		}
	}
}
