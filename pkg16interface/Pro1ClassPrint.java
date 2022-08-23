package com.pkg16interface;

public class Pro1ClassPrint implements Pro1InterfacePrint {

	public void print() {System.out.println("Hello");} 
	
	public static void main(String args[]){  
		Pro1ClassPrint p = new Pro1ClassPrint();
		p.print();
	}
}
