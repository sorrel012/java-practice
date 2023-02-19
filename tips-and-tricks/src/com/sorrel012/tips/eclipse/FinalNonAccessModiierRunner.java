package com.sorrel012.tips.eclipse;

final class FinalClass { //클래스에 final을 붙이면 상속이 되지 않는다.
	
}

class SomeClass {
	final public void doSomething() {} //메소드에 final을 붙이면 오버라이딩이 되지 않는다.
	
	public void doSomethingElse(final int arg) { // 매개변수에 final을 붙이면 값을 변경할 수 없다.
		
	}
}
public class FinalNonAccessModiierRunner {
	
	public static void main(String[] args) {

		final int i = 5; //변수에 final을 붙이면 초기값을 변경할 수 없다.
		

	} //main
	
	//대부분의 변수를 final로 선언하는 것을 지향해야 한다.
	
}
