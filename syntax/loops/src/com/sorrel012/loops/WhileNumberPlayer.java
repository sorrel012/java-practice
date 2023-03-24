package com.sorrel012.loops;

public class WhileNumberPlayer {
    private int limit;

    public WhileNumberPlayer(int limit) {
	this.limit = limit;
    }

    public void printSquaresUptoLimit() { //제곱수
	int i = 1;

	while(i*i <= limit) {
	    System.out.print(i*i + " ");
	    i++;
	}
	System.out.println();
    }

    public void printCubesuptoLimit() { //세제곱수
	int i = 1;

	while(i*i*i <= limit) {
	    System.out.print(i*i*i + " ");
	    i++;
	}
	System.out.println();
    }


}
