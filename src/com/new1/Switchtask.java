package com.new1;

import java.util.Scanner;

public class Switchtask {
	
	
	public void bikes() {
		Scanner sc = new Scanner(System.in);
		String types = sc.next() ;
	
	for (int i=1;i<=1;i++) {
		
		switch (types) {
		
		case "RE":
			System.out.println("Touring bike");
		break;
		
		case "KTM" :
			System.out.println("Sports bike");
		break;
		
		case "Ducati" :
			System.out.println("Super bike");
		default:
		System.out.println("Select another bike");
		}
		
	}
	}
	public static void main(String[] args) {
		Switchtask x = new Switchtask();
		x.bikes();
	}
}


		
