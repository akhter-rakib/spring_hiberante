package com.rakib.annotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotaion.xml");
		// retrive bean from spring container
		CricketCoach cricket = context.getBean("cricketCoach", CricketCoach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		// check they are same or not
		boolean result = (cricket == cricketCoach);
		System.out.println("Pointing the same object : " + result);
		System.out.println("Memory location of cricket : " + cricket);
		System.out.println("Memory location of cricketCoach : " + cricketCoach);
		// close the context
		context.close();

	}

}
