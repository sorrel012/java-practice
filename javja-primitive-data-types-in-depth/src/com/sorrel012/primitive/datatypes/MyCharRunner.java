package com.sorrel012.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('6');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
//		myChar.printLowerCaseAlphabets();
//		myChar.printUpperCaseAlphabets();
	}

}
