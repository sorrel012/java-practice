package com.sorrel012.oops.interfaces;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
	System.out.println("Jump");
    }

    @Override
    public void down() {
	System.out.println("Goes into a hole");
    }

    @Override
    public void left() {
	System.out.println("Go backward");
    }

    @Override
    public void right() {
	System.out.println("Go forward");
    }

}
