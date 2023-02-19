package com.sorrel012.com;

public class ConcurrencyRunner {

	public static void main(String[] args) {

		BiCounterWithAtomicInteger atomic = new BiCounterWithAtomicInteger();
		
		atomic.incrementI();
		atomic.incrementI();
		atomic.incrementI();
		
		System.out.println(atomic.getI());

		
		atomic.decrementI();
		
		System.out.println(atomic.getI());
		
	} //main
	
}
