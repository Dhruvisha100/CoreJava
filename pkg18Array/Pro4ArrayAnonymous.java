package com.pkg18Array;

public class Pro4ArrayAnonymous {

	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		print(new int[] {1,2,3,4});
	}
}
