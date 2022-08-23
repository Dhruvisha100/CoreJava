package com.pkg1variable;

public class Pro3VariableStaticInstanceLocal {

	static int m = 100;
	
	int localVariable() {
		int n = 9;
		return n;
		
	}
	
	public static void main(String args[]) {
		int o = 50;
		Pro3VariableStaticInstanceLocal p = new Pro3VariableStaticInstanceLocal();
		int a = p.localVariable();
		System.out.println("static " + m  +"...."+ " instance " + o +"...."+ " local " + a);
	}
}
