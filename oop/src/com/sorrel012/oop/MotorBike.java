package com.sorrel012.oop;

public class MotorBike {
	private int speed;

	void setSpeed(int speed) { // local variable
		this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike Started");
	}

}
