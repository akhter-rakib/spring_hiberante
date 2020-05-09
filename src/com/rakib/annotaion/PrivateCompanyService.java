package com.rakib.annotaion;

import org.springframework.stereotype.Component;

@Component
public class PrivateCompanyService implements CompanyService {

	@Override
	public double salary() {
		return 5000;
	}

}
