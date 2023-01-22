package com.new1;

public class Primenum {
	
	
	
	public static boolean test(int n) {
	for (int i=2;i<n;i++) {				//for fails return true so j will print
		if (n%i == 0) {					//if fails i increment
		return false;			  		//return false will end and j will increment
		}
	}
		return true;				//return true j will print and j increment
		
		}
	
	
	public static void main(String[] args) {
		for(int j=2;j<100;j++) {
			if(test(j)) {
			System.out.println(j);
			}
		}
	}

}
