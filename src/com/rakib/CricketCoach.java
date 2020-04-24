package com.rakib;

public class CricketCoach implements Coach {

	private HappyFortuneService happyFortuneService;

	public CricketCoach(HappyFortuneService happyFortuneService) {
		this.happyFortuneService = happyFortuneService;
	}

	@Override
	public String getDaillyWork() {
		return "Dailly 50 min practice";
	}

	@Override
	public String getFortune() {
		return happyFortuneService.getFortune();
	}

}
