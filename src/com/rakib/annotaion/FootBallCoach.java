package com.rakib.annotaion;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "football practice dailly 50 min";
	}

}
