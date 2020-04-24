package com.rakib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		CricketCoach cricket = context.getBean("cricketCoach", CricketCoach.class);
		// call methods on the bean
		System.out.println("IOC : " + cricket.getDaillyWork());
		System.out.println("By Construc inject  : " + cricket.getFortune());
		System.out.println("By setter inject :" + cricket.getLuckyService());
		// close the context
		context.close();
	}

}
