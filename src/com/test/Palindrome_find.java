package com.test;

public class Palindrome_find {
	
	int a = 15123;
	int b = a;
	int pal = 0;
	
	public void test() {
		
		while(a>0) {
		int c= a%10;
		pal = (pal*10)+c;
		a=a/10;
		
		}
		System.out.println(pal);
	
		if(pal == b) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}	
	}
	

//	String s = "MalAyalaM";
//	String rev = "" ;
//	
//	public void test() {
//		
//		System.out.println(s.length());
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);	
//		}
//		System.out.println(rev);
//		if (rev.equalsIgnoreCase(s)) {
//			System.out.println("Palindrome");
//		}else
//			System.out.println("Not a palindrome");
//	}
//	
//	
//	
	public static void main(String[] args) {
		Palindrome_find x = new Palindrome_find();
		x.test();
	}

}
