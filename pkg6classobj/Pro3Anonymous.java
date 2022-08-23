package com.pkg6classobj;

public class Pro3Anonymous {

	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String args[]) {
		new Pro3Anonymous().fact(5);
	}
}
