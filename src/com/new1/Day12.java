package com.new1;

import java.util.Scanner;				//Switch
						
public class Day12 {
	
	public void bikeTypes() {
	Scanner sc = new Scanner(System.in);
	String Bike = sc.next(); 
	
	switch (Bike) {
	case "RE" : 
		System.out.println("Touring bike");
		break;
	case "KTM": 
		System.out.println("Sports bike");
		break;
	case "TVS":
		System.out.println("Family bike");
		break;
	default:
		System.out.println("No bike");
		
	}
	
}
	public static void main(String[] args) {
		Day12 x = new Day12();
		x.bikeTypes();
	}
}
