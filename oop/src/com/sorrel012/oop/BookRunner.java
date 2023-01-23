package com.sorrel012.oop;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effactiveJava = new Book(800);
		Book cleanCode = new Book(500);

		System.out.printf("artOfComputerProgramming's initail number of copies is %d\n",
				artOfComputerProgramming.getNoOfCopies());
		System.out.printf("effactiveJava's initail number of copies is %d\n", effactiveJava.getNoOfCopies());
		System.out.printf("cleanCode's initail number of copies is %d\n", cleanCode.getNoOfCopies());
		System.out.println();

		artOfComputerProgramming.increaseCopies(500);
		effactiveJava.increaseCopies(100);
		cleanCode.increaseCopies(100);

		artOfComputerProgramming.decreaseCopies(200);
		effactiveJava.decreaseCopies(300);
		cleanCode.decreaseCopies(50);

		System.out.printf("artOfComputerProgramming's number of copies is %d\n",
				artOfComputerProgramming.getNoOfCopies());
		System.out.printf("effactiveJava's number of copies is %d\n", effactiveJava.getNoOfCopies());
		System.out.printf("cleanCode's number of copies is %d\n", cleanCode.getNoOfCopies());

	}

}
