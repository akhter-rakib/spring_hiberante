package com.rakib.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cityzen")
public class Cityzen implements CountryRule {

	private BussService bussService;

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

}
