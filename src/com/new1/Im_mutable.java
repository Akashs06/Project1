package com.new1;

public class Im_mutable {
	
	public static void main(String[] args) {
		
		String s = "Java";
		String s1 = "Welcome";
		String s2 = "Java";
		
		System.out.println(System.identityHashCode(s)); 
		System.out.println(System.identityHashCode(s1)); 
		System.out.println(System.identityHashCode(s2)); 
		
		s1 = s+s2;
		System.out.println(System.identityHashCode(s1));
		
		String s3 = new String("James");
		System.out.println(System.identityHashCode(s3)); 
		
		String s4 = new String("James");
		System.out.println(System.identityHashCode(s4));
		
		s3 = s3+s4;
		System.out.println(System.identityHashCode(s3));
		
	}

}
