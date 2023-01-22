package com.sorrel012.oop;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effactiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(100);
		effactiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);

		artOfComputerProgramming.increaseCopies(30);
		effactiveJava.increaseCopies(50);
		cleanCode.increaseCopies(100);

		artOfComputerProgramming.decreaseCopies(15);
		effactiveJava.decreaseCopies(20);
		cleanCode.decreaseCopies(40);

		System.out.printf("artOfComputerProgramming's number of copies is %d\n",
				artOfComputerProgramming.getNoOfCopies());
		System.out.printf("effactiveJava's number of copies is %d\n", effactiveJava.getNoOfCopies());
		System.out.printf("cleanCode's number of copies is %d\n", cleanCode.getNoOfCopies());

	}

}
