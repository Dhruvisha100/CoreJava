package com.pkg9static;

class Demo{

	int rollno;
	String name;
	static String collage = "ITS";
	
	public Demo(int r,String n) {
		rollno = r;
		name = n;
	}
	
	public Demo(int r,String n, String clg) {
		rollno = r;
		name = n;
		collage = clg;
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " + collage);
	}
}

public class Pro1StaticVariable {

	public static void main(String args[]) {
		Demo demo1 = new Demo(1, "abc");
		demo1.display();
		Demo demo2 = new Demo(2,"xyz","ijk");
		demo2.display();
		Demo demo3 = new Demo(3,"xyz","ijk");
		demo3.display();
	}
}
