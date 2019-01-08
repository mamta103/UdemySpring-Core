package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	// Defining a private field for dependency
	private FortuneService myFortuneService;
	// Defining a constructor for Dependency Injection
    public TrackCoach(FortuneService service){
    	myFortuneService= service;
    }
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
