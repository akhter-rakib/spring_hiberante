package com.rakib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beansLifeCycleapplicationContext.xml");
		// get bean
		BeanLifeCycle beanLifeCycle = context.getBean("beanLifeCycle", BeanLifeCycle.class);
		System.out.println(beanLifeCycle.giveMe());
		context.close();
	}

}
