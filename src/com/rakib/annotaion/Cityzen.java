package com.rakib.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cityzen")
public class Cityzen implements CountryRule {

	private BussService bussService;
	
	private PrivateCompanyService privateCompanyService;

	@Autowired
	public void setPrivateCompanyService(PrivateCompanyService privateCompanyService) {
		this.privateCompanyService = privateCompanyService;
	}

	@Autowired
	public Cityzen(BussService bussService) {
      this.bussService = bussService;
	}

	@Override
	public String walkDaily() {
		return "Will walk for 2 hour";
	}
	public String getPublicBussService() {  
		return bussService.getBusService();
	}
	public double getPrivateCompanyService() {
		return privateCompanyService.salary();
	}

}
