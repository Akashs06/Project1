package com.new1;

public class Day4_01 extends Day4 {
	
	
//	public Day4() {
//		System.out.println("hi iam constructor overriding");
//	}
//	
//	
	
	
	
	
	
	@Override							//method overriding
	public void bike () {			//Override // annotation
		System.out.println("Bike Deatils");
		this.bike(2);
		super.bike("RC");
		super.bike("Jawa", 'A');
	}
	
	public void bike ( String c , char d) {
		System.out.println("Touring Bike:" + c + ", " + "Model:" + d);
	}
	
	public static void main(String[] args) {
		Day4 x = new Day4_01();

//		Day4_01 y = new Day4_01();
//		y.bike();
		
	}
	
}
