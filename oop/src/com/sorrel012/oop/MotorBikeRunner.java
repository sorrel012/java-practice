package com.sorrel012.oop;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike bmw = new MotorBike(200);

		ducati.start();
		bmw.start();
		System.out.println();

		System.out.printf("ducati's initial speed is %dkm/h\n", ducati.getSpeed());
		System.out.printf("bmw's initial speed is %dkm/h\n", bmw.getSpeed());
		System.out.println();

		ducati.increaseSpeed(100);
		bmw.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		bmw.decreaseSpeed(30);

		System.out.printf("ducati's speed is %dkm/h\n", ducati.getSpeed());
		System.out.printf("bmw's speed is %dkm/h", bmw.getSpeed());
	}
}
