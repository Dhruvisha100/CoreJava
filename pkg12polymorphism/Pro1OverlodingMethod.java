package com.pkg12polymorphism;

class Overload{
	static 	int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a, int b,int c) {
		return a+b+c;
	}
}

public class Pro1OverlodingMethod {

	public static void main(String[] args){
		Overload ol = new Overload();
		System.out.println(ol.add(1, 2));
		System.out.println(ol.add(1, 2, 3));
	}
}
