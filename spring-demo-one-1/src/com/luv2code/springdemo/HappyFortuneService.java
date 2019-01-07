package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "This is Your Lucky Day...";
	}

}
