package com.uhsnarp.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

	@Inject
	CdiDAO cdiDAO;

	public CdiDAO getCdiDAO() {
		return cdiDAO;
	}

	public void setCdiDAO(CdiDAO cdiDAO) {
		this.cdiDAO = cdiDAO;
	}

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = cdiDAO.getData();
		for (int value : data) {
			greatest = value > greatest ? value : greatest;
		}
		return greatest;
	}
}
