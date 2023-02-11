package com.sorreo012.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
	this.name = name;
	
	for(int mark: marks) {
	    this.marks.add(mark);
	}
    }

    public int getNumberOfMarks() {
	return marks.size();
    } //getNumberOfMarks

    public int getTotalSumOfMarks() {
	int sum = 0;
	for(int mark : marks) {
	    sum += mark;
	}
	return sum;
    } //getTotalSumOfMarks

    public int getMaxMark() {
	int max = Integer.MIN_VALUE;
	for(int mark : marks) {
	    if(mark > max) {
		max = mark;
	    }
	}
	return max;
    } //getMaxMark

    public int getMinMark() {
	int min = Integer.MAX_VALUE;
	for(int mark : marks) {
	    if(mark < min) {
		min = mark;
	    }
	}
	return min;
    } //getMinMark

    public BigDecimal getAverageMarks() {
	int sum = getTotalSumOfMarks();
	int number = getNumberOfMarks();

	return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

}
