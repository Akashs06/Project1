package com.new1;

public class Day2 {

	public void stdId() {
		System.out.println("ID: 123");
	}
	private void stdName() {
		System.out.println("Name: Abc");
	}
	protected void stdDept() {
		System.out.println("Dept: CSC");
	}
	void stsSub() {
		System.out.println("Subject: English");
		System.out.println("Subject: Tamil");
	}
	public void stdMarks() {
		System.out.println("English: 90");
		System.out.println("Tamil: 90");
	}
	public static void main(String[] args) {
		Day2 a = new Day2();
		a.stdId();
		a.stdName();
		a.stdDept();
		a.stsSub();
		a.stdMarks();
	}
}
