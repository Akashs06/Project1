package com.new1;

import java.util.Scanner;

public class Day11 {						//Condition Statement
	
	public void aadhar() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i>=1 && i<=5) {
			System.out.println("Fingerprint not necessary");
		}
		else if(i>=6 && i<=14) {
			System.out.println("Fingerprint should be updated");
		}
		else if(i>=15 && i<=60) {
			System.out.println("Fingerprint already updated");
		}
		else if(i>60 && i<=100) {
			System.out.println("Fingerprint not mandatory");
		}
		else
		System.out.println("No Aadhar");
	}
	
	public static void main(String[] args) {
		Day11 x = new Day11();
		x.aadhar();
	}

}
