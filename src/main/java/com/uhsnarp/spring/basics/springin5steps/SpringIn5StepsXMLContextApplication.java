package com.uhsnarp.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhsnarp.spring.basics.springin5steps.xml.XMLPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml")) {
			LOGGER.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);
			LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());
		}
	}
}