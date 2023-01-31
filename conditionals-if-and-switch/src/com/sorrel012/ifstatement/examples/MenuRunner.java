package com.sorrel012.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1 : ");
		int number1 = sc.nextInt();
		System.out.println("The first number you entered is :" + number1 + "\n");

		System.out.print("Enter Number 2 : ");
		int number2 = sc.nextInt();
		System.out.println("The second number you entered is :" + number2 + "\n");

		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.print("Chooses Operation number : ");
		int operation = sc.nextInt();

		int result = 0;

		if (operation == 1) {
			result = number1 + number2;
		} else if (operation == 2) {
			result = number1 - number2;
		} else if (operation == 3) {
			result = number1 * number2;
		} else {
			result = number1 / number2;
		}

		System.out.println("Result = " + result);

	}
}
