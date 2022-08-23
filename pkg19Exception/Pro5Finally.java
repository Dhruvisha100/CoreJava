package com.pkg19Exception;

public class Pro5Finally {

	public static void main(String args[]) {
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
	}
}
