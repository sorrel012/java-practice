package com.sorrel012.com;

public class ConcurrencyRunner {

	public static void main(String[] args) {

		Counter counter = new Counter();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println(counter.getI());

	} //main
	
}
