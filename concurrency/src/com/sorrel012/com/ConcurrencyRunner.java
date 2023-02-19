package com.sorrel012.com;

public class ConcurrencyRunner {

	public static void main(String[] args) {

		BiCounterWithLock lock = new BiCounterWithLock();
		
		lock.incrementI();
		lock.incrementI();
		lock.incrementJ();
		lock.incrementI();
		
		System.out.println(lock.getI());
		System.out.println(lock.getJ());
		
	} //main
	
}
