package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load the Spring Configuration File.
            ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve bean from spring container.
            CricketCoach cricketCoach= context.getBean("cricketCoach", CricketCoach.class);
		// get method on bean
            System.out.println(cricketCoach.getDailyWorkout());
            System.out.println(cricketCoach.getDailyFortune());
            
           // cricketCoach.setFortuneService(fortuneService);
            
            //Access the Literal Inject Value
            System.out.println(cricketCoach.getEmailAdress());
            System.out.println(cricketCoach.getTeam());
		// close connection
            context.close();

	}

}
