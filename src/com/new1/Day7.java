package com.new1;

public class Day7 {			//class variable
	
	int a = 10;  		//class variable with initialization 
	
	int b;				//class variable with Declaration
	
	public void add() {
		int a = 50;			//local variable
		int b=20;			//local variable
		System.out.println(a);
		System.out.println(b);
	}
	
	public void sub() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Day7 x = new Day7();
		x.add();
		x.sub();
	}

}
