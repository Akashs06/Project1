package com.new1;

public class Day3 extends Day2 { //single inheritance 
	
	public void clgName() {
		System.out.println("Collage Name: SRM");
	}
	public void ClgBranch() {
		System.out.println("Collage Branch: VDP");
	}
	
	public static void main(String[] args) {
		Day3 b = new Day3();
		b.stdId();
		b.stdDept();
		b.clgName();
		b.ClgBranch();
	}

}
