package com.pkg8constructor;

public class Pro2Parameterized {

	String name;
	
	public Pro2Parameterized(String n) {
		name = n;
	}
	
	public static void main(String args[]) {
		Pro2Parameterized prmt = new Pro2Parameterized("abc");
		System.out.println(prmt.name);
	}
}