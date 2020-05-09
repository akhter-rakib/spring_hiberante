package com.rakib.annotaion;

import org.springframework.stereotype.Component;

@Component
public class BussService implements GovtFreeService {

	@Override
	public String getBusService() {
		// TODO Auto-generated method stub
		return "Regular two time bus service avaiable for public";
	}

}
