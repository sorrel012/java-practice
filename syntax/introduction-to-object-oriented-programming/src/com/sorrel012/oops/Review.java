package com.sorrel012.oops;

public class Review {


    private String description;
    private int rating;

    public Review(String description, int rating) {
	this.description = description;
	this.rating = rating;
    }

    @Override
    public String toString() {
	return String.format("description : %s, rating : %d", description, rating);
    }

}
