package com.new1;


public class Vowelstest {
	
	public static void main(String[] args)

	{
		
		String s = "kashe";
		String str = s.toLowerCase();
		int count = 0;
		
			for (int i=0;i<=str.length()-1;i++) {
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				System.out.println(" is vowel ");
				break;
			}
			else {
					System.out.println("not vowel");
			}
				count++;		
				}
			}
			
			
			
			
		}
		
	

	

