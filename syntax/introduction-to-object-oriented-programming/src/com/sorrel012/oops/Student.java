package com.sorrel012.oops;

public class Student extends Person{

    public Student(String name) {
	super(name);
    }

    private String college;
    private int year;

    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}

