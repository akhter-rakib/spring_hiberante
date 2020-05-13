package com.rakib.annotaion;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Batting practice regular 30 hour";
	}

}
