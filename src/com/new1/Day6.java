package com.new1;

public class Day6 {
	
//	public Day6() {  //Default constructor
//		
//	}
	
	public Day6(int a) {  //parameterized constructor
		this("ABC" + " " , 'b');
		System.out.println(a);
	}
	
	public Day6(String name , char b) {  //constructor overloading
		this('M');
		System.out.println(name + b);
	}
	
	public Day6(char c) {  //parameterized constructor
		this();
		System.out.println(c);
	}
	
	public Day6() {  //no argument or non parameterized constructor
		System.out.println("Details");
	}
	
	public static void main(String[] args) {
		Day6 y = new Day6(1);
		
	}
	
}
