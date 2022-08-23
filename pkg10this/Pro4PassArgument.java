package com.pkg10this;

public class Pro4PassArgument {
	
	void m(Pro4PassArgument obj) {
		System.out.println("invoke");
	}
	
	void n() {
		m(this);
	}
	
	  public static void main(String args[]){  
		  Pro4PassArgument passArgument = new Pro4PassArgument();
		  passArgument.n();
	  }
}
