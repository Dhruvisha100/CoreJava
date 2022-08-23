package com.pkg11super;

class Person{
	int id;
	String name;
	
	Person(int i, String n){
		this.id = i;
		this.name = n;
	}
}

class Employee extends Person{
	
	int salary;
	
	Employee(int i,  String n, int s){
		super(i,n);
		this.salary = s;
	}
	
	void print() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Pro4SuperCount {

	public static void main(String args[]) {
		Employee emp = new Employee(1, "abc", 20000);
		emp.print();
	}
}
