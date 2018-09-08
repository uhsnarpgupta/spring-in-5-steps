package com.uhsnarp.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.uhsnarp.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	// Get this bean from context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		assertEquals(3, binarySearch.binarySearch(new int[] {}, 5));
	}

}
