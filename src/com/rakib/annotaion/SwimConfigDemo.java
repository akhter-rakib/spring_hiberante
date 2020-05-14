package com.rakib.annotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemo {

	public static void main(String[] args) {
		// load the config class
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		// get bean
		SwimCoach coach = contex.getBean("swimCoach", SwimCoach.class);
		// retrive method
		System.out.println(coach.getAdvice());
		System.out.println("Email Address : " + coach.getEmail());
		// close
		contex.close();
	}
}
