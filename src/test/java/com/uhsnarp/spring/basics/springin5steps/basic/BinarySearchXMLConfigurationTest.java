package com.uhsnarp.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLConfigurationTest {

	// Get this bean from context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		assertEquals(3, binarySearch.binarySearch(new int[] {}, 5));
	}

}
