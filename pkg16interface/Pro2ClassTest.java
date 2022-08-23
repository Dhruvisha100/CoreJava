package com.pkg16interface;

public class Pro2ClassTest {
	public static void main(String args[]){  
		Pro2InterfaceDrawable d = new Pro2Circle();
		Pro2InterfaceDrawable d1 = new Pro2Rectangle();
		d.draw();
		d1.draw();
	}
}
