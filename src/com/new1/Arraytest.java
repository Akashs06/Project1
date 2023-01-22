package com.new1;

public class Arraytest {
	
	public void test() {
	
		String s[] = new String[6];
		int n [] = {1,2,3,4,5,6,7,8,9};
		
		s[0] = "ABC";
		s[1] = "XYZ";
		s[2] = "JKL";
		s[5] = "QWE";
		
	//System.out.println(s[2]);
	//System.out.println(i[2]);
	
	System.out.println(s.length);
	
	System.out.println("------------");
	
	for (int i=0;i<s.length;i++) {	
		System.out.println(s[i]);
	}
	
	System.out.println("------------");
	
	for (String i : s) {
		System.out.println(i);
	}
	
	System.out.println("------------");
	for (int d : n) {
		System.out.println(d);
	}
}
	
	public static void main(String[] args) {
		Arraytest a = new Arraytest();
		a.test();
	}
}
