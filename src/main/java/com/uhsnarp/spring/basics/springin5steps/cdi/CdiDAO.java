package com.uhsnarp.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class CdiDAO {
	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}
}
