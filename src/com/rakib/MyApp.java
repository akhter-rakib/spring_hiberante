package com.rakib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		CricketCoach cricket = context.getBean("cricketCoach", CricketCoach.class);
		// call methods on the bean
		System.out.println(cricket.getDaillyWork());
		System.out.println(cricket.getFortune());
		// close the context
		context.close();
	}

}
