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
		System.out.println("The second number you entered is :" + number2);
	}
}
