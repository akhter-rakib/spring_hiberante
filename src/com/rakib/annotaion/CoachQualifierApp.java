package com.rakib.annotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachQualifierApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotaion.xml");
		// get bean
		CoachQualifier coachQualifier = context.getBean("coachQualifier", CoachQualifier.class);
		//
		System.out.println("Coach Advice " + coachQualifier.getCoachAdvice());
		// close contex
		context.close();
	}

}
