package com.sorrel012.oops;

public class Fan {
    
    //state
    private String make;
    private double radius;
    private String color;
    
    private boolean isOn;
    private byte speed;//1~5
    
    //creation(Constructor)
    public Fan(String make, double radius, String color) {
	this.make = make;
	this.radius = radius;
	this.color = color;
    }
    
    public void switchOn() {
	this.isOn = true;
	setSpeed((byte)5);
    }
    
    public void switchOff() {
	this.isOn = false;
	setSpeed((byte)0);
    }
    
    public void setSpeed(byte speed) {
	this.speed = speed;
    }
    
    
    //print the state
    @Override
    public String toString() { //일반적으로 제일 밑에 생성하는 메소드
	return String.format("make: %s, radius: %f, color: %s, isOn: %b, speed: %d",
		make, radius, color, isOn, speed);
    }
}
