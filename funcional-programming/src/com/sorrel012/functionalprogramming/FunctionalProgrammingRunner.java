package com.sorrel012.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Bat");
//		printWithFP(list);
		printWithFPWithFiltering(list);
		
	} //main

	private static void pringBasic(List<String> list) {
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(
						element -> System.out.println("element : " + element)
						);
	}
	
	
	private static void pringBasicWithFiltering(List<String> list) {
		for(String str : list) {
			if(str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
					.filter(element -> element.endsWith("at"))
					.forEach(element -> System.out.println("element : " + element) );
	}
	
}
