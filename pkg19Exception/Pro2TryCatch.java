package com.pkg19Exception;

public class Pro2TryCatch {

	public static void main(String args[]) {
		try {
			int data = 20/0;
		}
		catch(Exception e) {
			System.out.println("By 0  not allow");
		}
	}
}
