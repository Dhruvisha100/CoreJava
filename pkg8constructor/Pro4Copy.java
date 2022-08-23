package com.pkg8constructor;

public class Pro4Copy {

	int id;
	String name;
	
	Pro4Copy(int i,String n) {
		id = i;
		name = n;
	}
	
	Pro4Copy(Pro4Copy copy) {
		id = copy.id;
		name = copy.name;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}

    public static void main(String args[]){
    	
    	Pro4Copy p1 = new Pro4Copy(1,"abc");
    	Pro4Copy p2 = new Pro4Copy(p1);
    	
    	p1.display();
    	p2.display();
    }
}
