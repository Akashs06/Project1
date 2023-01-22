package com.new1;

public class Day7_02 {			//casting
	
	public void wide() {		//Widening
		int a = 1000;
		short b = 12345;
		short s = (short)a;
		
		System.out.println(s);
	}
	
	public void narrow() {		//narrowing
		double d = 12345.12345;
		float f = 1357.1357f;
		short s = 3490;
		byte b = (byte)s;
		int i = (int)d;
		System.out.println(i);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Day7_02 x = new Day7_02();
		x.wide();
		x.narrow();
	}
}
