package com.new1;

public class Armtest {
	
	public static void main(String[] args) {
		int a = 153;
		
		int b =a;
		int value = 0;
		
		while (b>0) {
		int c = b%10;  //3  5
		b = b/10;		//15  1	
		value= value + c*c*c;
		}
		System.out.println(value);
		if (value == a) {
			System.out.println("Arm");
		}
		else {
			System.out.println("not Arm");
		}
		}
	}

