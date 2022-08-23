package com.pkg22collection.cdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro1ArrayList {

	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
