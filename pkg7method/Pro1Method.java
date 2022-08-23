package com.pkg7method;

class Demo
{
	int no1;
	int no =3;
	String name ="abc";
	
	void demoMethod() {
		System.out.println(no + " " + name + " " + no1);
	}
	
	void demoMtd(int n, String nm, int no1) {
		no = n;
		name = nm;
		no1 = no1;
		//System.out.println(no + " " + name + " " + no1);
	}
}

public class Pro1Method {

	 public static void main(String args[]){  
		 Demo demo = new Demo();
		 int a = demo.no1 = 12;
		 demo.demoMethod();

		 int b = demo.no1 = 5;
		 demo.demoMtd(22, "xyz",b);
		 demo.demoMethod();
		 
	 }
}
