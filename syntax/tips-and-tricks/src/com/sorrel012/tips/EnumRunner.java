package com.sorrel012.tips;

import java.util.Arrays;

enum Season {
	
	Winter(1), Spring(2), Summer(3), Fall(4);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	
}

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.Winter;
		System.out.println(season);
		
		Season season1 = Season.valueOf("Spring");
		System.out.println(season1);
		System.out.println();
		
		System.out.println("winter's index: " + season1.ordinal()); //enum에서 winter의 순서(index)
		System.out.println("winter's value: " + season1.getValue()); //enum에서 winter에게 할당한 값
		
		System.out.println("summer's index: " + Season.Summer.ordinal()); //enum에서 Fall의 순서(index)
		System.out.println("summer's value: " + Season.Fall.getValue()); //enum에서 Fall의 순서(index)
		
	System.out.println("enum: " + Arrays.toString(Season.values())); // enum의 모든 값 출력

	} //main
	
}
