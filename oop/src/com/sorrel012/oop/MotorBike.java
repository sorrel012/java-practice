package com.sorrel012.oop;

public class MotorBike {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0)
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed -= howMuch;
	}

	void start() {
		System.out.println("Bike Started");
	}
}
