package com.sorrel012.oop;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike bmw = new MotorBike();

		ducati.start();
		bmw.start();
		System.out.println();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		bmw.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		bmw.decreaseSpeed(30);

		System.out.printf("ducati's speed is %dkm/h\n", ducati.getSpeed());
		System.out.printf("bmw's speed is %dkm/h", bmw.getSpeed());
	}
}
