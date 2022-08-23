package com.pkg8constructor;

public class Pro3Overloding {
	int id;  
    String name;  
    int age;  
    
    public Pro3Overloding(int i) {
    	id = i ;
    }
    
    public Pro3Overloding(int i, String n, int a) {
    	id = i;
    	name = n;
    	age = a;
    }
    
    public void display() {
    	System.out.println(id + " " + name + " " + age);
    }
    
    public static void main(String args[]) {
    	Pro3Overloding ovrl = new Pro3Overloding(1);
    	Pro3Overloding ovrl2 = new Pro3Overloding(1,"abc",30);
    	ovrl.display();
    	ovrl2.display();
    }
}
