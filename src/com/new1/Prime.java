package com.new1;

import java.util.Scanner;

public class Prime {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int count =0;
	
	
	public void primeTest() {
		for(int i=2;i<a;i++) {

		if (a%i ==0) {
				System.out.println("not Prime");
				count =1;
				break;
			}	
		}
			if (count==0) {
				System.out.println("prime");
			}
	}
	
	public static void main(String[] args) {
		Prime x = new Prime();
		x.primeTest();
	}
}
	



 