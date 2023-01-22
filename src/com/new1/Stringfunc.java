package com.new1;

public class Stringfunc {
	
	public static void main(String[] args) {
		
		String s = "    Welcome to java    ";
		String s1 = "History of Java";
		String s2 = "welcome to Java";
		
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("W");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("w");
		System.out.println(endsWith);
		
		boolean contains = s.contains("to");
		System.out.println(contains);
		
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(11);
		System.out.println(charAt);
		
		String replace = s.replace("a", "v");
		System.out.println(replace);
		
		String substring = s.substring(5,9);
		System.out.println(substring);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String trim = s.trim();
		System.out.println(trim);
		
		String concat = s.concat(s1);
		System.out.println(concat);
		
	}
	
	
}
