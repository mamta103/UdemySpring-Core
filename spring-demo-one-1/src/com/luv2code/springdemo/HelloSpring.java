package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {

		//Load the Spring Configuration files
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve  Bean From Spring Conatiner
		Coach theCoach= applicationContext.getBean("myCoach", Coach.class);
		//Load The Method
		 System.out.println(theCoach.getDailyWorkout());
		//Close the Context
		applicationContext.close();//Code Cleaning-Up
		
		
	}
}
