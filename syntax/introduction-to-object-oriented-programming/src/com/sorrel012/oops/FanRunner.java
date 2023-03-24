package com.sorrel012.oops;

public class FanRunner {
    
    public static void main(String[] args) {

	Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
	
	System.out.println(fan.toString());
	
	fan.switchOn();
	System.out.println(fan.toString());
	
	fan.setSpeed((byte)3);
	System.out.println(fan.toString());
	
	fan.switchOff();
	System.out.println(fan.toString());
	
    } //main
}
