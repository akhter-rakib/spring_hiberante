package com.rakib.annotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemo {

	public static void main(String[] args) {
		// load the config class
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		// get bean
		SwimCoach coach = contex.getBean("footBallCoach", SwimCoach.class);
		// retrive method
		System.out.println(coach.getAdvice());
		// close
		contex.close();
	}
}
