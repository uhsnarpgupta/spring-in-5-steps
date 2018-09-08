package com.uhsnarp.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.uhsnarp.spring.basics.springin5steps.cdi.CdiBusiness;

//@SpringBootApplication
@Configuration
@ComponentScan()
public class SpringIn5StepsCdiApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);
		CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);
		LOGGER.info("{} dao-{}", cdiBusiness, cdiBusiness.getCdiDAO());

	}
}
