package com.new1;

public class Day5_03 implements Day5, Day5_01, Day5_02 {  //interface implements

	@Override
	public void product() {
		System.out.println("Mobile details");
	}
	@Override
	public void brand() {
		System.out.println("Oneplus");
	}	
	
		
	
	public static void main(String[] args) {
		Day5_03 x = new Day5_03();
		x.product();
		x.brand();
		
	}

}
