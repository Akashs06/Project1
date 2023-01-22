package com.new1;

public class Day7_01 {
	
	static int a = 10;			//static variable with initialization
	static String b ;			//static variable with declaration
	String str = "java";		// non static variable
	
	public static void add() {
//		static int d = 20;		//should not use static keyword in static method
		int a = 50;				//local variable for static
		System.out.println(a + " " + b);
//		System.out.println(str);	//non-static variable cannot be accessed in static method
		
	}
	
	public void sub() {
		int a = 100;
		System.out.println(b);		//static variable can be used in non-static method
		System.out.println(a);
	}
	public static void main(String[] args) {
		Day7_01 x = new Day7_01();
		add();
		x.sub();
		System.out.println(a);		//can be accessed without object
		System.out.println(x.str);	//can be accessed only with object
	}
}
