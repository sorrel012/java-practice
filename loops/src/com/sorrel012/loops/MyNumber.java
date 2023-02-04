package com.sorrel012.loops;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
	this.number = number;
    }

    public boolean isPrime() {

	if(number < 2) { //Guard Condition : 메소드 전에 넣는 소스 값이 유효한지 확인
	    return false;
	}

	for(int i = 2; i < number; i++) {
	    if(number % i == 0) {
		return false;
	    }
	}

	return true;
    }

    public int sumUptoN() {
	int sum = 0;

	for(int i = 1 ; i <= number; i++) {
	    sum = sum + i;
	}

	return sum;
    }

    public int sumOfDivisors() {
	int divisorSum = 0;

	for(int i = 2 ; i < number; i++) {
	    if(number % i == 0) {
		divisorSum = divisorSum + i;
	    }
	}

	return divisorSum;
    }

    public void printNumberTriangle() {
	for(int i = 1; i < number + 1; i++) {
	    for(int j = 1; j < i + 1; j++  ) {
		System.out.print(j + " ");
	    }
	    System.out.println();
	}

    }

}
