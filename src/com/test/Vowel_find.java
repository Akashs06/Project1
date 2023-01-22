package com.test;

public class Vowel_find {
	
	public static void main(String[] args){
		
		String s = "ak";
//		String str = s.toLowerCase();
//		int count = 0;
		
			for (int i=0;i<=s.length()-1;i++) {
			
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
				System.out.println(" is vowel ");
				break;
			}
			else {
					System.out.println("not vowel");
					break;
			}
	//			count++;		
				}
			}
}
