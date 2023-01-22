package com.new1;

public class Buffertest {
	
	public void test() {
	
	StringBuffer sb = new StringBuffer("Welcome Java");
	StringBuffer sb1 = new StringBuffer("Java");
	StringBuffer sb2 = new StringBuffer("Language");
	
	System.out.println(System.identityHashCode(sb));
	System.out.println(System.identityHashCode(sb1));
	System.out.println(System.identityHashCode(sb2));
	
	sb = sb.append(sb2);
	System.out.println(sb);
	System.out.println(System.identityHashCode(sb));
	
	sb2=sb2.replace(2, 4, "date");
	System.out.println(sb2);
	System.out.println(System.identityHashCode(sb2));
	
	sb1=sb1.reverse();
	System.out.println(sb1);
	
	}
	
	public static void main(String[] args) {
		Buffertest x = new Buffertest();
		x.test();
	}
}
