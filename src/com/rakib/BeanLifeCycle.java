package com.rakib;

public class BeanLifeCycle {

	public String giveMe() {
		return "give me some money";
	}

	public void initMethod() {
		System.out.println("Inside init method");
	}

	public void destroyMethod() {
		System.out.println("Destroy method");
	}

}
