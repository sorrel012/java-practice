package com.sorrel012.oops;

public class BookRunner {

    public static void main(String[] args) {

	Book book = new Book(123, "OOP", "Hanee");

	book.addReview(new Review("Great Book", 5));
	book.addReview(new Review("Awesome", 5));

	System.out.println(book);

    } //main

}
