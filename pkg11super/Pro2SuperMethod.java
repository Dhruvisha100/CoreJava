package com.pkg11super;

class AnimalDemo{
	void eat() {
		System.out.println("eating");
	}
}

class DogDemo extends AnimalDemo{
	void eat() {
		System.out.println("eat");
	}
	
	void dogDemo() {
		System.out.println("DogDemo");
	}
	
	void wrok() {
		super.eat();
		eat();
		dogDemo();
	}
}

public class Pro2SuperMethod {
	public static void main(String args[]){  
		DogDemo d = new DogDemo();
		d.wrok();
	}
}
