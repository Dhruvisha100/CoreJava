package com.pkg2opertor;

public class Pro1Unary {

	public static void main(String args[]){  
//		int x=10;  
//		System.out.println(x++);//10 (11)  
//		System.out.println(++x);//12  
//		System.out.println(x--);//12 (11)  
//		System.out.println(--x);//10  
	
	
		int a = 10;
		System.out.println(a++);
		int b = 10;
		System.out.println(++b);
		int c = 10;
		System.out.println(c--);
		int d = 10;
		System.out.println(--d);
		
		int e=10;  
		int f=10;  
		System.out.println(e++ + ++e);//10+12=22  
		System.out.println(f++ + f++);//10+11=21  
		
		int g = 10;
		System.out.println(~g);
	}
}
