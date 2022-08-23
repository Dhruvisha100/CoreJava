package com.pkg8constructor;

public class Pro1Default {
	
	int no;
	String name;
	
	public Pro1Default() {
			no = 10;
			name = "abc";
	}
	
	public static void main(String[] args) {
		Pro1Default dflt = new Pro1Default();
		System.out.println(dflt.no + " " + dflt.name);
	}

}
