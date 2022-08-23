package com.pkg14inheritance;

class A{
	void aMethod() {
		System.out.println("a");
	}
}

class B extends A{
	void bMethod() {
		System.out.println("b");
	}
}

public class Pro1Single {

	public static void main(String args[]) {

		B bB = new B();
		bB.bMethod();
		bB.aMethod();

	}
}
