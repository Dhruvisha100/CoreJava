package com.pkg12polymorphism;

class Overriding{
	void run() {
		System.out.println("Overriding");
	}
}

public class Pro2OverridingMethod {

	void run() {
		System.out.println("run");
	}
	
	public static void main(String args[]){ 
		Overriding ordg1 = new Overriding();
		Pro2OverridingMethod ordg = new Pro2OverridingMethod();
		ordg.run();
		ordg1.run();
	}
}
