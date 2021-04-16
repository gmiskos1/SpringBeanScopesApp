package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
				ClassPathXmlApplicationContext context =
						new ClassPathXmlApplicationContext("applicationContext.xml");
						
				// retrieve bean from spring container
				Vehicle car = context.getBean("myCar", Vehicle.class);

				Vehicle sportCar = context.getBean("mySportCar", Vehicle.class);
				
				
				// check if they are the same
				boolean result = (car == sportCar);
				
				// print out the results
				System.out.println("\nPointing to the same object: " + result);
				
				System.out.println("\nMemory location for car: " + car);

				System.out.println("\nMemory location for sport car: " + sportCar + "\n");
				
				//== but....
				Vehicle anotherSportCar = context.getBean("mySportCar", Vehicle.class);
				boolean anotherResult = (anotherSportCar == sportCar);
				System.out.println("\nPointing to the same object: " + anotherResult);
				
				System.out.println("\nMemory location for sport car: " + sportCar);

				System.out.println("\nMemory location for another Sport Car: " + anotherSportCar + "\n");
				// close the context
				context.close();
	}

}
