package com.pkg6classobj;

class Demo{
	int no;
	int id = 1;
	String name = "abc";
	
}

public class Pro2ObjOutsde {

	 public static void main(String args[]){  
		 Demo demo = new Demo();
		 demo.no = 3;
		 System.out.println(demo.id + "   " + demo.name + "  "+ demo.no);
		 
		 Demo dm = new Demo();
		 demo.no = 5;
		 System.out.println(demo.id + "   " + demo.name + "  "+ demo.no);
		 
	 }
}
