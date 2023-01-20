package com.sorrel012.oop;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike bmw = new MotorBike();

		ducati.start();
		bmw.start();

		ducati.setSpeed(100);
		bmw.setSpeed(80);

		ducati.setSpeed(20);
		bmw.setSpeed(0);
	}

}
