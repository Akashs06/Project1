package com.new1;

import java.util.Scanner;			//Scanner

public class Day8 {
	Scanner x = new Scanner(System.in);		//scanner syntax
	
	public void id() {
		int a = x.nextInt();
//		float b = x.nextFloat();
		System.out.println(a);		//nextInt-accepts integer
//		System.out.println(b);
	}
	public void name() {
		String c = x.next();		//next-accepts one word 
		System.out.println(c);
	}
	
	public void fullName() {
		String d = x.nextLine();	//nextLine-accepts full sentence
		System.out.println(d);
	}
	public void single() {			
		char e = x.next().charAt(3);	//counts single char
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Day8 y = new Day8();
		y.fullName();
		y.id();
		y.name();
		y.single();
		
	}
	
}
