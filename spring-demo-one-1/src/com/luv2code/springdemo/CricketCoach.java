package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
    private String emailAdress;
    private String team;
    
	public CricketCoach() {
		System.out.println("Cricket :Inside no-args constructor");
	}

	
	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach inside setEmailAdress() method.");
		this.emailAdress = emailAdress;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach inside setTeam() method.");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach inside setFortuneService() method.");
		this.fortuneService = fortuneService;
	}

	public String getEmailAdress() {
		return emailAdress;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice Hard 15 mins fast balwing";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
