package com.pkg22collection.cdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Pro2LinkedList {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay..");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
