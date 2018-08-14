package com.ksh.standard.oop.classes;

// # eye-1
public class Bicycle {
	// # eye-2
	// bicycle has a cadence, speed, gear ...	
	private int cadence = 0;
	private int speed = 0;
	private int gear = 0;
	
	// # eye-3
	//Default constructor (Non Parameterized constructor)
	public Bicycle() {
		
	}
	// # eye-3
	//Bicycle has a Parameterized constructor 
	public Bicycle(int cadence , int speed, int gear ){
		this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
	}
	
	// # eye-4
	//methods to pass set the vlaues
	public void setCadence(int cadence) {
		this.cadence  = cadence;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void printStates() {
		System.out.println("Cadence : "+cadence+", speed : "+speed+" gear: "+gear);
	}
}