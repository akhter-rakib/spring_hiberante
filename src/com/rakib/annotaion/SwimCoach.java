package com.rakib.annotaion;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${std.email}")
	private String email;
	@Value("${std.pass}")
	private String pass;

	private SadFortune sadFortune;

	public SwimCoach(SadFortune sadFortune) {
		this.sadFortune = sadFortune;
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Swime practice regular two Hours";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
