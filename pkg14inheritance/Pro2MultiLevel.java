package com.pkg14inheritance;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

public class Pro2MultiLevel {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}
