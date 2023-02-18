package com.sorrel012.functionalprogramming;

import java.util.List;

public class TerminalOperation {
	
	public static void main(String[] args) {

		/*
		 * List<Integer> list = List.of(23,12,34,53); System.out.println("원본 리스트: " +
		 * list);
		 * 
		 * int max = list.stream().max(Integer::compare).get();
		 * System.out.println("최댓값: " + max);
		 * 
		 * int min = list.stream().min(Integer::compare).get();
		 * System.out.println("최솟값: " + min);
		 * 
		 * int sum = IntStream.range(1, 11).reduce(0, (n1,n2) -> n1+n2);
		 * System.out.println("1~10까지의 총합: " + sum);
		 * 
		 * List<Integer> oddList = list.stream().filter(e -> e%2 ==
		 * 1).collect(Collectors.toList()); System.out.println("홀수들만: " + oddList);
		 */

		
		int max = List.of(23,12,53).stream().filter(n -> n%2 == 0).max(Integer::compare).orElse(0);
		System.out.println(max);
		
		int max2 = List.of(23,13,53).stream().filter(n -> n%2 == 0).max(Integer::compare).orElse(0);
		System.out.println(max2);
		
	} //main
}