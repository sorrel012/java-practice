package com.sorrel012.exceptionhandling;

import java.util.Scanner;

public class TryWithResourceRunner {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {

			int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[21];
		}

	} //main
	
}
