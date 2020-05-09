package com.rakib.annotaion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotaion.xml");

		// get the bean from spring container
		Cityzen cityzen = context.getBean("cityzen", Cityzen.class);
		// call a method on the bean
		System.out.println(cityzen.walkDaily());
		System.out.println(cityzen.getPublicBussService());
		System.out.println(cityzen.getPrivateCompanyService());
		// close
		context.close();
	}
}
