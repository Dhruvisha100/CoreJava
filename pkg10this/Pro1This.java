package com.pkg10this;

class This{

	int no;
	String name;
	float fee;
	
	
	This(int n, String nm, float f){
		this.no = n;
		this.name = nm;
		this.fee = f;
	}
	
	void demo(){
		System.out.println(no + " " + name + " " + fee);
	}
}

public class Pro1This {

	public static void main(String args[]) {
		
		This t = new This(1,"avxx",2000);
		t.demo();
	
	}
}
