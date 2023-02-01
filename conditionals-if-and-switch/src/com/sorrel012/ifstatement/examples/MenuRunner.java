package com.sorrel012.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1 : ");
		int number1 = sc.nextInt();
		System.out.println("The first number you entered is : " + number1 + "\n");

		System.out.print("Enter Number 2 : ");
		int number2 = sc.nextInt();
		System.out.println("The second number you entered is : " + number2 + "\n");

		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		System.out.print("Chooses Operation number : ");
		int operator = sc.nextInt();

		int result1 = performOperationUsingNestedIfElse(number1, number2, operator);
		int result2 = performOperationUsingSwitch(number1, number2, operator);

		System.out.println("Result1 = " + result1);
		System.out.println("Result2 = " + result2);

	}

	private static int performOperationUsingNestedIfElse(int number1, int number2, int operator) {
		int result = 0;
		if (operator == 1) {
			result = number1 + number2;
		} else if (operator == 2) {
			result = number1 - number2;
		} else if (operator == 3) {
			result = number1 * number2;
		} else {
			result = number1 / number2;
		}
		return result;
	}

	private static int performOperationUsingSwitch(int number1, int number2, int operator) {
		int result = 0;
		switch (operator) {
		case 1:
			result = number1 + number2;
			break;
		case 2:
			result = number1 - number2;
			break;
		case 3:
			result = number1 * number2;
			break;
		default:
			result = number1 / number2;
			break;
		}
		return result;
	}
}
