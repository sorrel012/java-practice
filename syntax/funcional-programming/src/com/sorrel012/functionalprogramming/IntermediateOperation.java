package com.sorrel012.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperation {
	
	public static void main(String[] args) {

		//1~10까지 제곱값 구하기
		IntStream.range(1, 11).map(e -> e * e).forEach(System.out::println);
		System.out.println();
		System.out.println();
		
		//소문자로 매핑하여 출력하기
		List.of("Apple", "Ant", "Bat").stream().map(String::toLowerCase)
												.forEach(System.out::println);
		System.out.println();
		System.out.println();
		
		//문자열 길이 출력하기
		List.of("Apple", "Ant", "Bat").stream().map(String::length)
												.forEach(System.out::println);
		System.out.println();
		System.out.println();
		
	} //main
}
