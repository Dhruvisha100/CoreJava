package com.pkg12polymorphism;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike{
	void run() {
		System.out.println("splendor");
	}
}

public class Pro3Runtime {

	public static void main(String args[]) {

		Bike b = new Splendor();
		b.run();
	}
}
