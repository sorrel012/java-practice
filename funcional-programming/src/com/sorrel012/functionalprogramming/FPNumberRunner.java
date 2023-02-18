package com.sorrel012.functionalprogramming;

import java.util.List;

public class FPNumberRunner {
	
	public static void main(String[] args) {

		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
//		numbers.stream().forEach(element -> System.out.println(element));
		
		int sum = numbers.stream().reduce(0,
											(number1, number2) -> number1 + number2
											);
		System.out.println("모든 숫자의 합 : " + sum);
		
		sum = numbers.stream().filter(number -> number%2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("모든 홀수의 합 : " + sum);

		sum = numbers.stream().filter(number -> number%2 == 0).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("모든 짝수의 합 : " + sum);
		
	} //main

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum  += number;
		}
	}
	
}
