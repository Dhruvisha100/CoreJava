package com.pkg10this;

class A{
	void m() {
		System.out.println("m");
	}
	 
	void n() {
		System.out.println("n");
		this.m();
	}
}

public class Pro2ThisMethod {

	public static void main(String args[]) {
		A a = new A();
		a.n();
	}
}
