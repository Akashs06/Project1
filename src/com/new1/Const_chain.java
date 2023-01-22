package com.new1;

public class Const_chain {
	
	public Const_chain(int a) {
		this("iphone" , 10);
		System.out.println(a);
	}
	public Const_chain(String name , int type ) {
		this('a');
		System.out.println(name + type);
	}
	public Const_chain(char battery) {
		this();
		System.out.println("mobile battery");
	}
	public Const_chain() {
		System.out.println("Details");
	}
	public static void main(String[] args) {
		Const_chain x = new Const_chain(5);

	}

}
