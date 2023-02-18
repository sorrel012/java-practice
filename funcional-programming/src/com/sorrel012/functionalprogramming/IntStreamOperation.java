package com.sorrel012.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperation {

	public static void main(String[] args) {

		List<Integer> list = IntStream.range(1, 10).map(e -> e * e).boxed()
													.collect(Collectors.toList());
		System.out.println(list);
		
	} //main
	
}