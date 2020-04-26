package com.rakib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beasnScopeapplicationContext.xml");
		// retrieve bean from spring container
		// by default bean scope is singleton
		BeanScope scope = context.getBean("scope", BeanScope.class);
		BeanScope scopes = context.getBean("scope", BeanScope.class);
		boolean result = (scope == scopes);
		System.out.println(result);
	}

}
