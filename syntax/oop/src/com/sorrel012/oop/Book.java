package com.sorrel012.oop;

public class Book { 
	private int noOfCopies;

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) { // local variable
		if (noOfCopies >= 0)
			this.noOfCopies = noOfCopies;
	}

	public void increaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
