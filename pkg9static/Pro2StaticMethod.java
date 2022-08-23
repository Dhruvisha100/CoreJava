package com.pkg9static;

class Examp{
	int no;
	static String name = "ABC";
	
	static void change() {
		name = "mno";
	}
	
	Examp(int n, String nm){
		no = n;
		name = nm;
	}
	
	void Exampm(){
		System.out.println(no + " " + name);
	}
}

public class Pro2StaticMethod {

	public static void main(String args[]) {
		Examp.change();
		
		Examp Examp = new Examp(1,"abc");
		Examp.Exampm();
	}
}
