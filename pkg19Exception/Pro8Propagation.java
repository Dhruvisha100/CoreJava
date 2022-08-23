package com.pkg19Exception;

public class Pro8Propagation {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Pro8Propagation obj = new Pro8Propagation();
		obj.p();
		System.out.println("normal flow...");
	}
}