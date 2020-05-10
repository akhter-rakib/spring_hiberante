package com.rakib.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MiddleClassCityZen {

	private BussService bussService;
	@Autowired
	private CompanyService companyService;

	@Autowired
	public void injectByMethod(BussService bussService) {
		this.bussService = bussService;
	}

	public String getBussService() {
		return bussService.getBusService();
	}

	public double getSalary() {
		return companyService.salary();
	}

}
