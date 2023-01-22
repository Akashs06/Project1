package com.test;

public class Reverse_string {
	
	public static void main(String[] args) {
		
		
//		String s = "Welcome to java";
//		String reverse="";
//		
//		for (int i = s.length()-1; i >= 0; i--) {
//			char charAt = s.charAt(i);
//			reverse=reverse+charAt;	
//		}
//		System.out.println(reverse);
		
		
		String s = "Welcome to java";
		
		String[] split=s.split(" ");
		String reverse="";
		
		for (String string : split) {
			for (int i = string.length()-1; i >= 0; i--) {
				char charAt = string.charAt(i);
				reverse=reverse+charAt;	
			}
			reverse=reverse+" ";
			
		}System.out.println(reverse);
		
	}

}
