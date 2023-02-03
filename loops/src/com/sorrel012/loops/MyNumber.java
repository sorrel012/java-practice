package com.sorrel012.loops;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
	this.number = number;
    }

    public boolean isPrime() {

	if(number < 2) {
	    return false;
	}

	for(int i = 2; i < number; i++) {
	    if(number % i ==0) {
		return false;
	    }
	}

	return true;
    }

}
