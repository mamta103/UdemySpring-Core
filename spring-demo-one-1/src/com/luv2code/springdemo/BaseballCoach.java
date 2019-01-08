package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// Defining a private field for dependency
	private FortuneService fortuneService;

	// Defining a constructor for Dependency Injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It :"+fortuneService.getFortune();
	}

}
