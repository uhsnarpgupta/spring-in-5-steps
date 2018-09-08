package com.uhsnarp.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Service;

@Service
//@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
