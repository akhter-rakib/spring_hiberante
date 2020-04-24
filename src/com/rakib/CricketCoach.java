package com.rakib;

public class CricketCoach implements Coach {

	private HappyFortuneService happyFortuneService;
	
	private LuckyService luckyService;

	public CricketCoach(HappyFortuneService happyFortuneService) {
		this.happyFortuneService = happyFortuneService;
	}

     public void setLuckyService(LuckyService luckyService) {
		this.luckyService = luckyService;
	}	
	@Override
	public String getDaillyWork() {
		return "Dailly 50 min practice";
	}

	@Override
	public String getFortune() {
		return happyFortuneService.getFortune();
	}

	@Override
	public String getLuckyService() {
		return luckyService.luckyMessage();
	}

}
