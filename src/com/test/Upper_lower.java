package com.test;

public class Upper_lower {
	
	public static void main(String[] args) {
		
//		String s = "WelCOme to JaVa";
//		String upper = "";
//		String lower = "";
//		for (int i = 0; i < s.length(); i++) {
//			char s1=s.charAt(i);
//			if(s1>=65 && s1<=90) {
//				upper=upper+s1;	
//			}else if (s1>=97 && s1<=122) {
//				lower=lower+s1;	
//			}
//		}
//		System.out.println("Upper is : " + upper);
//		System.out.println("Lower is : " + lower);
		
		String s = "WelCOme to JaVa";
		int upper =0;
		int lower =0;
		for (int i = 0; i < s.length(); i++) {
			char s1=s.charAt(i);
			if(s1>=65 && s1<=90) {
				upper++;	
			}else if (s1>=97 && s1<=122) {
				lower++;
			}
		}
		System.out.println("Upper is : " + upper);
		System.out.println("Lower is : " + lower);
	}
		
}
