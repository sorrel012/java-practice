package com.sorreo012.arrays;

import java.math.BigDecimal;

public class StudentRunner {

    public static void main(String[] args) {

	Student student = new Student("Hanee", 97, 98, 100);

	int number = student.getNumberOfMarks();
	int sum = student.getTotalSumOfMarks();
	int maxMark = student.getMaxMark();
	int minMark = student.getMinMark();
	BigDecimal average = student.getAverageMarks();

	System.out.println("number of marks : " + number);
	System.out.println("sum of marks : " + sum);
	System.out.println("maximum of marks : " + maxMark);
	System.out.println("minimum of marks : " + minMark);
	System.out.println("average of marks : " + average);
	
	System.out.println(student);
	
	student.addNewMark(35);
	
	System.out.println(student);
	
	student.removeMarkAtIndex(1);
	
	System.out.println(student);
	
    } //main
    

}
