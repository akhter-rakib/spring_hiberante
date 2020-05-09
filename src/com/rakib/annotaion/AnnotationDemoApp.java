package com.rakib.annotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotaion.xml");

		// get the bean from spring container
		CountryRule countryRule = context.getBean("cityzen", CountryRule.class);
		// call a method on the bean
		System.out.println(countryRule.walkDaily());
		// close
		context.close();
	}
}
