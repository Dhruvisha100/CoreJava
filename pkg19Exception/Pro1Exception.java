package com.pkg19Exception;

public class Pro1Exception {

	public static void main(String args[]) {
		try {
			int data = 20/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
