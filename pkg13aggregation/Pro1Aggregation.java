package com.pkg13aggregation;

public class Pro1Aggregation {

	int id;
	String name;
	ProAddress address;
	
	public Pro1Aggregation(int id, String name, ProAddress address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void print() {
		System.out.println( id + " " + name + " " + address.city + " " + address.state + " " + address.country);
	}
	
	public static void main(String args[]) {
		ProAddress addr = new ProAddress("abc","mno","xyz");
		Pro1Aggregation agrtion = new Pro1Aggregation(1, "ijk", addr);
		agrtion.print();
	}
}
