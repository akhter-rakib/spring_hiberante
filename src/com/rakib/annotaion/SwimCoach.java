package com.rakib.annotaion;

public class SwimCoach implements Coach {

	private SadFortune sadFortune;

	public SwimCoach(SadFortune sadFortune) {
		this.sadFortune = sadFortune;
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Swime practice regular two Hours";
	}

}
