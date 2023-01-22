package com.sorrel012.oop;

public class Book {
	private int noOfCopies;

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) { // local variable
		this.noOfCopies = noOfCopies;
	}

	public void increaseCopies(int howMuch) {
		this.noOfCopies += howMuch;
	}

	public void decreaseCopies(int howMuch) {
		this.noOfCopies -= howMuch;
	}
}
