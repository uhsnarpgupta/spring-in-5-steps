package com.uhsnarp.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.uhsnarp.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan()
//@ComponentScan("com.uhsnarp.spring.basics.springin5steps")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class)) {
			// SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] { 3, 4, 17 }, 2);
			System.out.println(result);
		}
	}
}
