package com.new1;

public class Day5_06 implements Day5_05{ //class implementation

	@Override
	public void stdName() {
		System.out.println("Student Name: ABC");
		
	}
	@Override
	public void stdAge() {
		System.out.println("Student Age : 10");
		
	}
	@Override
	public void stdDept() {
		System.out.println("Student Dept: CSC");
	
	}
	@Override
	public void stdYear() {
		System.out.println("Student Year: 2022");
		
	}
	public static void main(String[] args) {
		Day5_05 x = new Day5_06();
		x.stdName();
		x.stdAge();
		x.stdDept();
		x.stdYear();
	}
	
}
