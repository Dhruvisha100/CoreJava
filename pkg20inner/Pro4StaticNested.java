package com.pkg20inner;

public class Pro4StaticNested {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		Pro4StaticNested.Inner obj = new Pro4StaticNested.Inner();
		obj.msg();
	}
}
