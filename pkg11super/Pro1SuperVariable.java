package com.pkg11super;

class Animal{
	String color = "white";
}

class Dog extends Animal{
	String color = "black";
	
	void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class Pro1SuperVariable {

	public static void main(String args[]){  
		Dog dog = new Dog();
		dog.print();
	}
}
