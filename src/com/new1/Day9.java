package com.new1;

public class Day9 {
	
	public void forTest() {				//for
		int i;
		for(i =1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("END");
	
	}
	
	public void whileTest() {			//while
		int i =1;
		while (i<=5) {
			i++;
			System.out.println(i);
		}
		System.out.println("END");
	}
	
	public void doWhileTest() {			//do-while
		int i =1;
		do {
			System.out.println(i);
			i++;
		}while (i<=5);
		System.out.println("END");
	}
	
	public static void main(String[] args) {
		Day9 x = new Day9();
		x.forTest();
		x.whileTest();
		x.doWhileTest();
	}
}
