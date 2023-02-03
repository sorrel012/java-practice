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
	    if(number % i ==0) {
		return false;
	    }
	}

	return true;
    }

}
