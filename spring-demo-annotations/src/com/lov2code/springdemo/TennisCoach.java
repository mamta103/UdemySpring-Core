package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
	}*/
	public TennisCoach(){
		System.out.println(">> Inside Default ConstructorL :)");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Your Backend Volley";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/*//define Setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Inside setFortuneService :)");
		this.fortuneService = fortuneService;
	}*/
	
	//define field injection
		@Autowired
		public void doSomeCrazyStuff(FortuneService fortuneService) {
			System.out.println(">> Inside doSomeCrazyStuff :)");
			this.fortuneService = fortuneService;
		}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
