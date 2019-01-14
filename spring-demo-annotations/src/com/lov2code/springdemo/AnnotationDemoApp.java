package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// get the call from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);

		// call the method to bean
		System.out.println(coach.getDailyWorkout());

		// call the method for getDailyFortune
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();
	}

}
