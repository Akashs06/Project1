package com.test;


	
	public class Findnumberandcharacter {
	    public static void main(String[] args) {
	        String input = "Hello123World456";
	        String numbers = "", characters = "";

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isDigit(ch)) {
	                numbers += ch;
	            } else if (Character.isLetter(ch)) {
	                characters += ch;
	                
	            }
	        }

	        System.out.println("Numbers: " + numbers);
	        System.out.println("Characters: " + characters);
	    }
	}


