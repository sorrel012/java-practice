package com.sorrel012.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		
		Scanner scan = null;

		try {
			scan = new Scanner(System.in);
			
			int[] numbers = {12,3,4,5};

			int number = numbers[5];

			System.out.println("Before Scanner Close");
			
		} catch (Exception e ) {
			e.printStackTrace();
			
		} finally {
			System.out.println("Before Scanner Close");
			if(scan != null) {
				scan.close();
			}
		}
		
		System.out.println("Just before closing out main");

	} //main
	
}
