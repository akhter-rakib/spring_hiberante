package com.rakib.annotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// load the config class
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		// get bean
		Coach coach = contex.getBean("footBallCoach", Coach.class);
		// retrive method
		System.out.println(coach.getAdvice());
		// close
		contex.close();
	}
}
