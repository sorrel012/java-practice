package com.sorrel012.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void main(String[] args) {

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
														.map(String::length)
														.forEach(System.out::println);
		System.out.println();
		
		Integer max = List.of(23, 45, 67, 34).stream()
											.filter(n -> n%2 == 0)
											.max(Integer::compare)
											.orElse(0);
		
		
		Integer max2 = List.of(23, 45, 67, 34).stream()
											.filter(MethodReferencesRunner::isEven)
											.max(Integer::compare)
											.orElse(0);
		
		System.out.println(max2);
	

	} //main
	
	public static boolean isEven(Integer number) {
		return number%2 == 0;
	}
	
}
