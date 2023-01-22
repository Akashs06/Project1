package com.new1;

public class Cash_counter extends Dress implements Electronics , Home_appliances{

	@Override
	public void table() {
		System.out.println("Dinning Table");
		System.out.println("coffee Table");
		System.out.println("--------------");
	}
	
	@Override
	public void bed() {
		System.out.println("King size bed");
		System.out.println("Single bed");
		System.out.println("--------------");
	}

	@Override
	public void laptop() {
		System.out.println("Brand : Dell");
		System.out.println("Brand : HP");
		System.out.println("--------------");
	}

	@Override
	public void mobilePhones() {
		System.out.println("Brand : Apple");
		System.out.println("Brand : Oneplus");
		System.out.println("--------------");
	}

	@Override
	public void tshirt() {
		System.out.println("Printed Tshirt");
		System.out.println("Solid Tshirt");
		System.out.println("--------------");
	}

	@Override
	public void shirt() {
		System.out.println("Formal Shirt");
		System.out.println("Casual Shirt");
	}
	
	public static void main(String[] args) {
		Cash_counter x = new Cash_counter();
		x.table();
		x.bed();
		x.laptop();
		x.mobilePhones();
		x.tshirt();
		x.shirt();
	}

}
