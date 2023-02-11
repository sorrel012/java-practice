package com.sorreo012.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

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
	return Collections.max(marks);
    } //getMaxMark

    public int getMinMark() {
	return Collections.min(marks);
    } //getMinMark

    public BigDecimal getAverageMarks() {
	int sum = getTotalSumOfMarks();
	int number = getNumberOfMarks();

	return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
    
    @Override
    public String toString() {
	return name + marks;
    }

}
