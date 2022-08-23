package com.pkg6classobj;

class Example{
	int n;
	String name ;
	
	void demoMethod(int n , String name) {
		
		System.out.println(n + " " + name);
	}
}
public class Pro4MultiObj {
	public static void main(String args[]){  
		Example demo1 = new Example(), demo2 = new Example();
		demo1.demoMethod(1,"abc");
		demo2.demoMethod(2,"xyz");
	}
}
