package com.new1;

public class Day4 {  //method overloading
	
	public Day4() {
		System.out.println("hi iam constructor overriding");
	}
	
	public void bike () {
		System.out.println("Bike Details");
	}
	public void bike (int a) {
		System.out.println("Super Bike:" + " " + a );
	}
	public void bike ( String b ) {
		System.out.println("Sports Bike:" + " " + b );
	}
	public void bike ( String c , char d) {
		System.out.println("Touring Bike:" + c + ", " + "Model:" + d);
	}
	
	public void cycle() {
		System.out.println("parent Cycle");
	}
	
	public static void main(String[] args) {
		Day4 x = new Day4();
		x.bike();
		x.bike(1);
		x.bike("Duke");
		x.bike("RE", 'A');
	}
	
}
