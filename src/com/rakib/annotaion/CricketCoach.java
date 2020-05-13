package com.rakib.annotaion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	public CricketCoach() {
		System.out.println("Inside Constructor");
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("Post Constructor");
	}

	@PreDestroy
	public void destoryMethod() {
		System.out.println("Before bean destry ");
	}
}
