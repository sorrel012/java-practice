package com.sorrel012.oops;

public class StudentRunner {

    public static void main(String[] args) {

	Student student = new Student();

	student.setName("Hanee");
	student.setEmail("sorrel012@gmail.com");
	student.setPhoneNumber("010-1234-5678");
	student.setCollege("KE");
	student.setYear(3);

	System.out.printf("My name is %s.\n", student.getName());
	System.out.printf("My e-mail address is '%s'.\n", student.getEmail());
	System.out.printf("My phone number is %s.\n", student.getPhoneNumber());
	System.out.printf("I'm a student at %s.\n", student.getCollege());
	System.out.printf("I'm in %d grade.\n", student.getYear());

    } //main
}
