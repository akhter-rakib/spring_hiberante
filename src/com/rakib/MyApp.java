package com.rakib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach coach = context.getBean("cricketCoach", Coach.class);
		// call methods on the bean
		System.out.println(coach.getDaillyWork());
		// close the context
		context.close();
	}

}
