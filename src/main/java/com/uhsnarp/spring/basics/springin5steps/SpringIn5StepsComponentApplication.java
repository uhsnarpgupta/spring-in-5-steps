package com.uhsnarp.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.uhsnarp.spring.basics.componentscan.ComponentDAO;

//@SpringBootApplication
@Configuration
@ComponentScan("com.uhsnarp.spring.basics.componentscan")
public class SpringIn5StepsComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDao2 = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());
		LOGGER.info("{}", componentDao.getJdbcConnection());

		LOGGER.info("{}", componentDao2);
		LOGGER.info("{}", componentDao2.getJdbcConnection());

	}
}
