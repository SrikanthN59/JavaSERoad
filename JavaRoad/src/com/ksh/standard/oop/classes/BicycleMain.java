package com.ksh.standard.oop.classes;

//# eye-0
public class BicycleMain {
	/**
	 * To run the java program 
	 * @param args Strings
	 */
	public static void main(String[] args) {
		// # eye-1
		// Creating Objects
		Bicycle bicycle1 = new Bicycle(50, 10, 2);
		Bicycle bicycle2 = new Bicycle();
		
		// # eye-2
		// calling methods
		bicycle1.printStates();
		// # eye-3
		// without filing any values 
		bicycle2.printStates();
		
		// # eye-4
		bicycle2.setCadence(23);
		bicycle2.setGear(1);
		bicycle2.setSpeed(50);
		
		// # eye-4
		bicycle2.printStates();
	}
}
