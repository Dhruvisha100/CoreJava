package com.pkg16interface;

public class Pro3Ab implements Pro3A,Pro3B{

	public void print(){System.out.println("Hello");}  
	
	public static void main(String args[]){  
		Pro3Ab ab = new Pro3Ab();
		ab.print();
	}
}
