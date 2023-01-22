package com.new1;

public class Statictest {
	static int a = 10;
	static int b = 5;
	static int c ;
	int d = 100;
	int e = 50;
	int f ;
	
	public static void add() {
		Statictest x = new Statictest();
	//	f=d+e;
		System.out.println(x.f);
	}
	
	public static void main(String[] args) {
		Statictest x = new Statictest();
	//	x.add();
	}

}