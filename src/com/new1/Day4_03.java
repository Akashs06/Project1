package com.new1;

public class Day4_03 extends Day4_02 {  //Abstract implementation 
	
	@Override
	public void login_Username() {
		System.out.println("Username: ABC");
		
	}

	@Override
	public void login_Password() {
		System.out.println("Password: *****");
		
	}
	public static void main(String[] args) {
		Day4_02 x = new Day4_03();
		x.login_Username();
		x.login_Password();
	}


}
