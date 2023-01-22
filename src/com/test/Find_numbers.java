package com.test;

public class Find_numbers {
	
	public static void main(String[] args) {
		
	String s = "Akash@0612#";
	
	
	
	String number= s.replaceAll("[^0-9]", "");
	
	String character= s.replaceAll("[^a-zA-Z]", "");
	String special= s.replaceAll("[a-zA-Z0-9]", "");
	
	System.out.println(number);
	System.out.println(character);
	System.out.println(special);
	

	}
}
