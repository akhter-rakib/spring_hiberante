package com.rakib;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;

	private HappyFortuneService happyFortuneService;

	private LuckyService luckyService;

	public CricketCoach(HappyFortuneService happyFortuneService) {
		this.happyFortuneService = happyFortuneService;
	}

	public void setLuckyService(LuckyService luckyService) {
		this.luckyService = luckyService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
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
