package com.pkg15abstraction;

abstract class Bike {
	abstract void run();
}

public class Pro1Method extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike obj = new Pro1Method();
		obj.run();
	}
}
