package com.pkg11super;

class SuperClass{
	SuperClass(){
		System.out.println("class");
	}
}

class SuperDemo extends SuperClass{
	SuperDemo(){
		super();
		System.out.println("demo");
	}
}

public class Pro3SuperClass {

	public static void main(String args[]) {
		SuperDemo sd = new SuperDemo();
	}
}
