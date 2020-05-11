package com.rakib.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoachQualifier {
	@Autowired
	@Qualifier("footBallCoach")
	private Coach coach;

	public String getCoachAdvice() {
		return coach.getAdvice();
	}
}
