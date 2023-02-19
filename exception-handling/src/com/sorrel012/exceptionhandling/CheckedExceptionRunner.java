package com.sorrel012.exceptionhandling;

public class CheckedExceptionRunner {
	
	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(2000);
			
		} catch(InterruptedException e){
			e.printStackTrace();
		}

	} //main
	
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

}