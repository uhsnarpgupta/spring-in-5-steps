package com.uhsnarp.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger LOGGER =  LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	//@Qualifier("quick")
	SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postContruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy");
	}

}
