package com.rakib.annotaion;

import org.springframework.stereotype.Component;

@Component("cityzen")
public class Cityzen implements CountryRule {

	@Override
	public String walkDaily() {
		return "Will walk for 2 hour";
	}

}
