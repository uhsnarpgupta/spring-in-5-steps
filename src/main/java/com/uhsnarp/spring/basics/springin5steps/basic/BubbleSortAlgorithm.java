package com.uhsnarp.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
//@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
