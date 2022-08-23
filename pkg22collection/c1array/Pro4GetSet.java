package com.pkg22collection.c1array;

import java.util.ArrayList;

public class Pro4GetSet {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		// accessing the element
		System.out.println("Returning element: " + al.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		al.set(2, "Dates");
		// Traversing list
		for (String fruit : al)
			System.out.println(fruit);

	}
}
