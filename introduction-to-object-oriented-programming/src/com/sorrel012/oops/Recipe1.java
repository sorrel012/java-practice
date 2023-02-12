package com.sorrel012.oops;

public class Recipe1 extends AbstractRecipe {

    @Override
    void getReady() {
	System.out.println("Get the raw materials");
	System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
	System.out.println("Do the dish");
    }

    @Override
    void cleanUp() {
	System.out.println("Clean up the utensils");
    }

}
