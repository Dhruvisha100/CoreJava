package com.pkg10this;

class Cont{
	Cont(){
		System.out.println("a");
	}
	Cont(int x){
		this();
		System.out.println(x);
	}
}

public class Pro3Constructor {

	public static void main(String args[]) {
		Cont a = new Cont(10);
	}
}
