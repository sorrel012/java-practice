package com.sorrel012.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int number = 0;

	do {
	    System.out.print("Enter a number: ");
	    number = scanner.nextInt();
	    System.out.printf("Cube is %d\n\n", number*number*number);
	} while(number >= 0);
	System.out.println("Thank You! Have Fun!");
    }
}
