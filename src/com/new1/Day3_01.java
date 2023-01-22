package com.new1;

public class Day3_01 extends Day3 { //Multilevel inheritance 
	
	public void clgStart() {
		System.out.println("Collage In Time: 9:30AM");
	}
	public void clgEnd() {
		System.out.println("Collage Out Time: 4.00PM");
	}
	
	public static void main(String[] args) {
		Day3_01 c = new Day3_01();
		c.clgStart();
		c.clgEnd();
		c.clgName();
		c.ClgBranch();
		
	}
	
}
